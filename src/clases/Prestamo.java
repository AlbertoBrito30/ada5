/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author betit
 */
public class Prestamo {
    private Usuarios usuario;
    private Libros libro;
    private String fecha;

    public Prestamo(Usuarios usuario, Libros libro, String fecha) {
        this.usuario = usuario;
        this.libro = libro;
        this.fecha = fecha;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public Libros getLibro() {
        return libro;
    }

    public String getFecha() {
        return fecha;
    }
}

