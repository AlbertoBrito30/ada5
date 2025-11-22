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
public class RegistrarLibro {
    
    Scanner read = new Scanner(System.in);
    
    //leemos el ISBN no mayor de 5 digitos
    public int isbn() throws NumberFormatException, IllegalArgumentException{
        int auxIsbn;
        
        while(true){
            try {
                System.out.println("Ingrese el ISBN (no mayor que 5 digitos)");
                auxIsbn = Integer.parseInt(read.nextLine());
                
                if(auxIsbn > 99999 || auxIsbn < 1){
                    throw new IllegalArgumentException();
                }
                
                return auxIsbn;
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Solo puedes ingresar numeros enteros");
            } catch (IllegalArgumentException e){
                System.out.println("Error: El numero esta fuera de rango");
            }
        }
        
    }
    
    //leemos el titulo
    public String titulo() throws IllegalArgumentException{
        String auxTitulo;
        while(true){
            try{
                System.out.println("Ingrese el titulo:");
                //trim quita espacios del texto
                auxTitulo = read.nextLine().trim();
                
                //validamos que no este vacio o que no tenga digito "\\d" o mas de uno "\\d+"
                if (auxTitulo.isEmpty() || auxTitulo.matches("\\d+")) {
                    throw new IllegalArgumentException();
                }
                
                return auxTitulo;
            } catch(IllegalArgumentException e){
                System.out.println("Error: ingrese titulo valido o no deje vacio el espacio");
            }
        }
    }
    
    //leemos el autor
        public String autor() throws IllegalArgumentException{
        String auxAutor;
        while(true){
            try{
                System.out.println("Ingrese el autor:");
                //trim quita espacios del texto
                auxAutor = read.nextLine().trim();
                
                if (auxAutor.isEmpty() || auxAutor.matches("\\d+")) {
                    throw new IllegalArgumentException();
                }
                
                return auxAutor;
            } catch(IllegalArgumentException e){
                System.out.println("Error: ingrese autor valido o no deje vacio el espacio");
            }
        }
    }
    
    //leemos numero de copias
        public int numCopias(){
            int auxNumCopias;
            
            while(true){
                try{
                    System.out.println("Ingrese numero de copias");
                    auxNumCopias = Integer.parseInt(read.nextLine());
                    
                    if(auxNumCopias < 0){
                        throw new IllegalArgumentException();
                    }
                    return auxNumCopias;
                }catch(NumberFormatException e){
                    System.out.println("Error: por favor unicamente ingrese numeros");
                }catch(IllegalArgumentException e){
                    System.out.println("Error: por favor unicamente ingrese numeros positivos");
                }
            }
        }
    
    
    
}
