/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Generos;


public class Genero {
    
    //Atributos 
    private String nombre;
    private String descripcion;
    
    //Constructor
    public Genero(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    //Get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //toString
    @Override
    public String toString() {
        return "Genero{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
    
}
