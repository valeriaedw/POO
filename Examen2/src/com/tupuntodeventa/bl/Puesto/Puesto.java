
package com.tupuntodeventa.bl.Puesto;

import java.time.LocalDate;


public class Puesto {
    
    //Atributos
    private int idPuesto;
    private String nombre;
    private Float salarioBase;
    private Float salarioNeto;
    private Float bono;
    private LocalDate fechaContratacion;
    
    //Constructor
    public Puesto(String nombre, Float salarioBase, Float salarioNeto, Float bono, LocalDate fechaContratacion) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.salarioNeto = salarioNeto;
        this.bono = bono;
        this.fechaContratacion = fechaContratacion;
    }
    
    //Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Float getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(Float salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public Float getBono() {
        return bono;
    }

    public void setBono(Float bono) {
        this.bono = bono;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }
    
    
    
    //toString
    @Override
    public String toString() {
        return "nombre=" + nombre + ", salarioBase=" + salarioBase + ", salarioNeto=" + salarioNeto + ", bono=" + bono + ", fechaContratacion=" + fechaContratacion + '}';
    }
    
    
    
    
}
