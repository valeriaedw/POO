/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Artistas;

import java.time.LocalDate;


public class Artista{
    
    //Atributos
    private String nombre;
    private String apellido;
    private String nombreArtistico;
    private LocalDate fechaNacimiento;
    private LocalDate fechaDefuncion;
    private int edad;
    private String paisNacimiento;
    private String genero;
    private String descripcion;
    
    //Constructor
    public Artista(){
    
    
    }

    public Artista(String nombre, String apellido, String nombreArtistico, LocalDate fechaNacimiento, LocalDate fechaDefuncion, int edad, String paisNacimiento, String genero, String descripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreArtistico = nombreArtistico;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDefuncion = fechaDefuncion;
        this.edad = edad;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
        this.descripcion = descripcion;
    }
    
    //Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaDefuncion() {
        return fechaDefuncion;
    }

    public void setFechaDefuncion(LocalDate fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //to String

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", apellido=" + apellido + ", nombreArtistico=" + nombreArtistico + ", fechaNacimiento=" + fechaNacimiento + ", fechaDefuncion=" + fechaDefuncion + ", edad=" + edad + ", paisNacimiento=" + paisNacimiento + ", genero=" + genero + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
    
}
