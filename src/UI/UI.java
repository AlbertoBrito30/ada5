/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.util.Scanner;
import clases.Gestor;

/**
 *
 * @author betit
 */
public class UI {
    
    private Scanner read = new Scanner(System.in);
    private Gestor gestor = new Gestor();
    
    public void iniciar() {
        
        while (true) {
            System.out.println("\n===== SISTEMA DE BIBLIOTECA =====");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar usuario");
            System.out.println("3. Registrar préstamo");
            System.out.println("4. Mostrar libros disponibles");
            System.out.println("5. Mostrar préstamos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = Integer.parseInt(read.nextLine());
            
            switch (opcion) {
                case 1:
                    gestor.registrarLibro();
                    break;
                case 2:
                    gestor.registrarUsuario();
                    break;
                case 3:
                    gestor.registrarPrestamo();
                    break;
                case 4:
                    gestor.mostrarLibrosDisponibles();
                    break;
                case 5:
                    gestor.mostrarPrestamos();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    return; // rompe el while, termina iniciar()
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
