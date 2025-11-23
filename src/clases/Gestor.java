/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.*;
import Excepciones.*;

/**
 *
 * @author betit
 */
public class Gestor {
    Scanner read = new Scanner(System.in);
    
    //listas para libros e usuarios
    private ArrayList<Libros> libro = new ArrayList<>();
    private ArrayList<Usuarios> usuario = new ArrayList<>();
    private ArrayList<Prestamo> prestamos = new ArrayList<>();

    
    //instancia de los objetos
    private RegistrarLibro registrarLibro = new RegistrarLibro();
    private RegistrarUsuarios registrarUsuario = new RegistrarUsuarios();
    
    //Registro de los libros
    public void registrarLibro(){
        libro.add( new Libros(
        registrarLibro.isbn(),
        registrarLibro.titulo(),
        registrarLibro.autor(),
        registrarLibro.numCopias()
        ));
        System.out.println("El libro se a registrado");
    }
    
    //registro de los usuarios
    public void registrarUsuario(){
        usuario.add( new Usuarios(
        registrarUsuario.claveUsuario(),
        registrarUsuario.nombre(),
        registrarUsuario.licenciatura(),
        registrarUsuario.semestre()
        ));
        System.out.println("Usuario agregado");
    }
    
    //registrar los prestamos
    public void registrarPrestamo(){
        try {
            // Pedir clave del usuario
            System.out.println("Ingrese la clave del usuario:");
            int claveUser = Integer.parseInt(read.nextLine());

            // Buscar usuario
            Usuarios user = buscarUsuarioClave(claveUser);
            if (user == null) {
                throw new NullPointerException("El usuario no existe en el sistema.");
            }

            // Pedir ISBN
            System.out.println("Ingrese el ISBN del libro:");
            int isbn = Integer.parseInt(read.nextLine());

            // Buscar libro (puede lanzar LibroNoEncontradoException)
            Libros libroPrestamo = buscarLibroIsbn(isbn);

            // Validar disponibilidad
            if (libroPrestamo.getNumCopias() == 0) {
            throw new LibroNoDisponibleException("No hay copias disponibles de este libro.");
            }

            // Registrar el préstamo restando una copia
            libroPrestamo.setNumCopias(libroPrestamo.getNumCopias() - 1);

            //guardamos el prestamo
            prestamos.add(new Prestamo(user, libroPrestamo, java.time.LocalDate.now().toString()));


            System.out.println("\n--- Préstamo realizado correctamente ---");
            System.out.println("Usuario: " + user.getNombre());
            System.out.println("Libro: " + libroPrestamo.getTitulo());
            System.out.println("Copias restantes: " + libroPrestamo.getNumCopias());

        } catch (NumberFormatException e) {
            System.out.println("Error: ingrese solo números válidos.");
        } catch (LibroNoEncontradoException e) {
            System.out.println(e.getMessage());
        } catch (LibroNoDisponibleException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
    //mostrar libros disponibles
    public void mostrarLibrosDisponibles() {
        System.out.println("\n--- Libros disponibles ---");
        for (Libros l : libro) {
            if (l.getNumCopias() > 0) {
                System.out.println("ISBN: " + l.getIsbn() +
                                   " | Título: " + l.getTitulo() +
                                   " | Autor: " + l.getAutor() +
                                   " | Copias: " + l.getNumCopias());
            }
        }
    }
    
    //mostrar reporte de prestamos
    public void mostrarPrestamos() {
        System.out.println("\n--- Libros prestados ---");

        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados.");
            return;
        }

       for (Prestamo p : prestamos) {
            System.out.println("Usuario: " + p.getUsuario().getNombre() +
                               " | Libro: " + p.getLibro().getTitulo() +
                               " | Fecha: " + p.getFecha());
        }
    }



    
    
    /*los metodos de trabajo, bsqueda o acceso iran aqui abajo
    esto para que los metodos de arriba se usen en la ui y sea mas
    facil la lectura*/
    
    private Libros buscarLibroIsbn(int isbn) throws LibroNoEncontradoException{
        for (Libros l : libro) {
            if(l.getIsbn() == isbn){
                    return l;
            }
        }
        throw new LibroNoEncontradoException("El libro no se encontro o no existe");
    }
    
    private Usuarios buscarUsuarioClave(int claveUsuario){
        for (Usuarios user : usuario) {
            if (user.getClaveUsuario() == claveUsuario) {
                return user;
            }
        }
        return null;
    }
  
    
}
