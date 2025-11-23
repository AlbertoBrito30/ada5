/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author betit
 */
public class Libros {
    
    /*número único e internacional de 13 dígitos que identifica de
    forma exclusiva cada edición de un libro pero usaremos 5 para este caso*/
    private int isbn;
    private String titulo;
    private String autor;
    private int numCopias;
    
    //constructor que debe llevar datos de un libro
    public Libros(int isbn, String titulo, String autor, int numCopias){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numCopias = numCopias;
        
    }

    /*getters que nos permitiran mostrar los datos segun la 
    ui lo solicite u/o otra clase antes de ui*/
    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumCopias() {
        return numCopias;
    }
    
    //setter de numero de copias
    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }

            
}
