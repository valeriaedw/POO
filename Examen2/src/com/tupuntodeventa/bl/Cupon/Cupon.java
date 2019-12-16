
package com.tupuntodeventa.bl.Cupon;

import java.time.LocalDate;


public class Cupon {
    
    //Atributos
    
    private LocalDate fechaGenerado;
    private int codigo;
    private float descuento;
    private String estado;
    
    //Constructor

    public Cupon(LocalDate fechaGenerado, float descuento, String estado) {
        this.fechaGenerado = fechaGenerado;
        this.descuento = descuento;
        this.estado = estado;
    }

    Cupon(LocalDate fechaGenerado, float descuento) {
        this.fechaGenerado = fechaGenerado;
        this.descuento = descuento;
        
        
    }
   
    
    //Get y Set
    public LocalDate getFechaGenerado() {
        return fechaGenerado;
    }

    public void setFechaGenerado(LocalDate fechaGenerado) {
        this.fechaGenerado = fechaGenerado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
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
        return "fechaGenerado=" + fechaGenerado + ", codigo=" + codigo + ", descuento=" + descuento + ", estado=" + estado + '}';
    }
    
    
    
    
    
}
