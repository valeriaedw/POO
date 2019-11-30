/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Compositores;

import java.time.LocalDate;

public class Compositor {
    
    //Atributos
    private String nombre;
    private String apellido;
    private String paisNacimiento;
    private LocalDate fechaNacimiento;
    private int edad;
    
    //Constructor
    public Compositor(String nombre, String apellido, String paisNacimiento, LocalDate fechaNacimiento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.paisNacimiento = paisNacimiento;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
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

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //toString
    @Override
    public String toString() {
        return "Compositor{" + "nombre=" + nombre + ", apellido=" + apellido + ", paisNacimiento=" + paisNacimiento + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
