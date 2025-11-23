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
    
    Scanner read = new Scanner(System.in);
    
    //creamos metodos para registrar datos del usuario (clave de Usuario)
    public int claveUsuario() throws NumberFormatException, IllegalArgumentException{
        int auxclaveUsuario;
        
        while(true){
            try {
                System.out.println("Ingrese el ISBN (no mayor que 5 digitos)");
                auxclaveUsuario = Integer.parseInt(read.nextLine());
                
                if(auxclaveUsuario > 99999 || auxclaveUsuario < 1){
                    throw new IllegalArgumentException();
                }
                
                return auxclaveUsuario;
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Solo puedes ingresar numeros enteros");
            } catch (IllegalArgumentException e){
                System.out.println("Error: El numero esta fuera de rango");
            }
        }
        
    }
    
    
    
    
    
}
