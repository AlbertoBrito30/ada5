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
public class RegistrarUsuarios {
    
    private static Scanner read = new Scanner(System.in);
    
    /*creamos metodos para registrar datos del usuario (clave de Usuario)
    igual, no mayor a 5 digitos*/
    public int claveUsuario() throws NumberFormatException, IllegalArgumentException{
        int auxClaveUsuario;
        
        while(true){
            try {
                System.out.println("Ingrese la clave de usuario (no mayor que 5 digitos)");
                auxClaveUsuario = Integer.parseInt(read.nextLine());
                
                if(auxClaveUsuario > 99999 || auxClaveUsuario < 1){
                    throw new IllegalArgumentException();
                }
                
                return auxClaveUsuario;
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Solo puedes ingresar numeros enteros");
            } catch (IllegalArgumentException e){
                System.out.println("Error: El numero esta fuera de rango");
            }
        }
        
    }
    
    //registramos nombre
    public String nombre() throws IllegalArgumentException{
        String auxNombre;
        while(true){
            try{
                System.out.println("Ingrese su nombre:");
                //trim quita espacios del texto
                auxNombre = read.nextLine().trim();
                
                if (auxNombre.isEmpty() || auxNombre.matches("\\d+")) {
                    throw new IllegalArgumentException();
                }
                
                return auxNombre;
                
            } catch(IllegalArgumentException e){
                System.out.println("Error: ingrese un nombre valido o no deje vacio el espacio");
            }
        }
    }
    
    //registramos la licenciatura
    public String licenciatura() throws IllegalArgumentException{
        String auxLicenciatura;
        while(true){
            try{
                System.out.println("Ingrese el licenciatura");
                //trim quita espacios del texto
                auxLicenciatura = read.nextLine().trim();
                
                if (auxLicenciatura.isEmpty() || auxLicenciatura.matches("\\d+")) {
                    throw new IllegalArgumentException();
                }
                
                return auxLicenciatura;
            } catch(IllegalArgumentException e){
                System.out.println("Error: ingrese licenciatura valida o no deje vacio el espacio");
            }
        }
    }
    
    //tomamos el semestre como string a nuestro parecer es mas factible asi
    public int semestre() throws NumberFormatException, IllegalArgumentException{
        int auxSemestre;
        
        while(true){
            try {
                System.out.println("Ingrese el semestre de 1 a 9 (Solo numeros)");
                auxSemestre = Integer.parseInt(read.nextLine());
                
                if(auxSemestre > 9 || auxSemestre < 1){
                    throw new IllegalArgumentException();
                }
                
                return auxSemestre;
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Solo puedes ingresar numeros enteros");
            } catch (IllegalArgumentException e){
                System.out.println("Error: El numero esta fuera de rango, ingrese de 1 a 9");
            }
        }
        
    } 
    
    
}
