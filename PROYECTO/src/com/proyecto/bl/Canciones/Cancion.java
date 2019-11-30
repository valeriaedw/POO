/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Canciones;

import com.proyecto.bl.Albumes.Album;
import com.proyecto.bl.Artistas.Artista;
import com.proyecto.bl.Compositores.Compositor;
import com.proyecto.bl.Generos.Genero;
import java.io.InputStream;
import java.time.LocalDate;

public class Cancion {
    
    //Atributos
    
    private InputStream cancion;
    private String nombre;
    private String generoCancion; //Cambiar a tipo genero
    private String artista; // Cambiar a tipo Artista
    private String compositor; //Cambiar a tipo Compositor
    private LocalDate fechaLanzamiento;
    private String albumCancion; //Cambiar a tipo Album
    private String estado;
    private double precio;
    private int calificacion;
    
   
    
    
    //Constructor
    public Cancion (){
        
    }
   
    //Constructor

    public Cancion(InputStream cancion, String nombre, String generoCancion, String artista, String compositor, LocalDate fechaLanzamiento, String albumCancion, String estado, double precio, int calificacion) {
        this.cancion = cancion;
        this.nombre = nombre;
        this.generoCancion = generoCancion;
        this.artista = artista;
        this.compositor = compositor;
        this.fechaLanzamiento = fechaLanzamiento;
        this.albumCancion = albumCancion;
        this.estado = estado;
        this.precio = precio;
        this.calificacion = calificacion;
    }
   
    
    //Get y Set
    public InputStream getCancion() {   
        return cancion;
    }

    public void setCancion(InputStream cancion) {   
        this.cancion = cancion;
    }

    public String getNombre() {   
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneroCancion() {
        return generoCancion;
    }

    public void setGeneroCancion(String generoCancion) {
        this.generoCancion = generoCancion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getAlbumCancion() {
        return albumCancion;
    }

    public void setAlbumCancion(String albumCancion) {
        this.albumCancion = albumCancion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //toString
    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", generoCancion=" + generoCancion + ", artista=" + artista + ", compositor=" + compositor + ", fechaLanzamiento=" + fechaLanzamiento + ", albumCancion=" + albumCancion + ", calificacion=" + calificacion + '}';
    }
    
    
}
