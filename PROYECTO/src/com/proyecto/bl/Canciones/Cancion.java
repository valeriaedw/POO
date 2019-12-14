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
import java.util.ArrayList;

public class Cancion {
    
    //Atributos
    
    private String cancion;
    private String nombre;
    private String genero; //Cambiar a tipo genero
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

    public Cancion(String cancion, String nombre, String genero, String artista, String compositor, LocalDate fechaLanzamiento, String albumCancion, String estado, double precio, int calificacion) {
        this.cancion = cancion;
        this.nombre = nombre;
        this.genero = genero;
        this.artista = artista;
        this.compositor = compositor;
        this.fechaLanzamiento = fechaLanzamiento;
        this.albumCancion = albumCancion;
        this.estado = estado;
        this.precio = precio;
        this.calificacion = calificacion;
    }
   

  
    
    public Cancion(String cancion, String nombre,  String genero, String artista, String compositor, LocalDate fechaLanzamiento, String albumCancion,double precio, int calificacion) {
        this.cancion = cancion;
        this.nombre = nombre;
        this.genero = genero;
        this.artista = artista;
        this.compositor = compositor;
        this.fechaLanzamiento = fechaLanzamiento;
        this.albumCancion = albumCancion;
        this.precio = precio;
        this.calificacion = calificacion;
    }

  
    
    //Get y Set
    public String getCancion() {   
        return cancion;
    }

    public void setCancion(String cancion) {   
        this.cancion = cancion;
    }

    public String getNombre() {   
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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
        return "Cancion{" + "nombre=" + nombre + ", generoCancion=" + genero + ", artista=" + artista + ", compositor=" + compositor + ", fechaLanzamiento=" + fechaLanzamiento + ", albumCancion=" + albumCancion + ", calificacion=" + calificacion + '}';
    }
    
    
}
