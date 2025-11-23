/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.*;

/**
 *
 * @author betit
 */
public class Gestor {
    //listas para libros e usuarios
    private ArrayList<Libros> libro = new ArrayList<>();
    private ArrayList<Usuarios> usuario = new ArrayList<>();
    
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
    
    public void registrarUsuario(){
        usuario.add( new Usuarios(
        registrarUsuario.claveUsuario(),
        registrarUsuario.nombre(),
        registrarUsuario.licenciatura(),
        registrarUsuario.semestre()
        ));
        System.out.println("Usuario agregado");
    }
    
    
    
    
}
