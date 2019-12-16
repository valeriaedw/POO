
package com.tupuntodeventa.bl.Plato;

import com.tupuntodeventa.bl.Producto.Producto;
import com.tupuntodeventa.bl.Producto.Producto;


public class Plato extends Producto{
    
    //Atributos
    private Float precio;
    private String descripcion;
    
    //Constructor

    public Plato(int identificador) {
        super(identificador);
    }
    

    public Plato(Float precio, String descripcion, int identificador) {
        super(identificador);
        this.precio = precio;
        this.descripcion = descripcion;
    }

   
    
    //Get y Set
    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //Get y Set
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //toString
    @Override
    public String toString() {
        return "Plato{" + "precio=" + precio + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
    
}
