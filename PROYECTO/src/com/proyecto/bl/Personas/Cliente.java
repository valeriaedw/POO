/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Personas;

import java.sql.Date;
import java.time.LocalDate;


public class Cliente extends Persona{
    
    //Atributos
    protected LocalDate fechaNacimiento;
    protected int edad;
    protected String pais;
    
    //Constructor
    public Cliente(String id, String nombre, String apellido1, String apellido2, String avatar, String correo, String nombreUsuario, String contrasenia, LocalDate fechaNacimiento, int edad, String pais, String tipo) {
        super(id, nombre, apellido1, apellido2, avatar, correo, nombreUsuario, contrasenia, tipo);
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.pais = pais;
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

    public String getPais() {
        return pais;
    }

    //Get y Set
    public void setPais(String pais) {
        this.pais = pais;
    }

    //toString
    @Override
    public String toString() {
        return super.toString()+ "Cliente{" + "fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", pais=" + pais + '}';
    }
    
 
   

  
   
    
    
    
    
    
    
}
