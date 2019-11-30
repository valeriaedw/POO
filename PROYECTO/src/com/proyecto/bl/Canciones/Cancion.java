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
import java.time.LocalDate;

public class Cancion {
    
    //Atributos
    private String nombre;
    private Genero generoCancion;
    private Artista artista;
    private Compositor compositor;
    private LocalDate fechaLanzamiento;
    private Album albumCancion;
    private int calificacion;
    
    
    //Constructor
    public Cancion (){
        
    }
   
    //Constructor
    public Cancion(String nombre, Genero generoCancion, Artista artista, Compositor compositor, LocalDate fechaLanzamiento, Album albumCancion, int calificacion) {
        this.nombre = nombre;
        this.generoCancion = generoCancion;
        this.artista = artista;
        this.compositor = compositor;
        this.fechaLanzamiento = fechaLanzamiento;
        this.albumCancion = albumCancion; //Instanciar en el controler para 
        //enviar un objeto lleno ? o aqui y que se llene cuando se registra cancion???
        this.calificacion = calificacion;
    }
     
    
    //Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return generoCancion;
    }

    public void setGenero(Genero genero) {
        this.generoCancion = genero;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Compositor getCompositor() {
        return compositor;
    }

    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Album getAlbum() {
        return albumCancion;
    }

    public void setAlbum(Album albumCancion) {
        this.albumCancion = albumCancion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    //toString
    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", generoCancion=" + generoCancion + ", artista=" + artista + ", compositor=" + compositor + ", fechaLanzamiento=" + fechaLanzamiento + ", albumCancion=" + albumCancion + ", calificacion=" + calificacion + '}';
    }
    
    
}
