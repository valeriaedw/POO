
package com.tupuntodeventa.bl.Producto;


public class Producto {
    
    //Atributos
    private int identificador;
    
    //Constructor
    public Producto(int identificador) {
        this.identificador = identificador;
    }
    
    //Get y Set
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    //toString
    @Override
    public String toString() {
        return "Producto{" + "identificador=" + identificador + '}';
    }
    
    
    
}
