
package com.tupuntodeventa.bl.Combo;

import com.tupuntodeventa.bl.Plato.Plato;
import com.tupuntodeventa.bl.Plato.Plato;
import com.tupuntodeventa.bl.Producto.Producto;
import com.tupuntodeventa.bl.Producto.Producto;
import java.util.ArrayList;


public class Combo extends Producto{
    
    //Atributos
    private String nombre;
    private float costoTotal;
    private ArrayList<Plato> listaPlatos;
    
    //Constructor

    public Combo(String nombre, float costoTotal, ArrayList<Plato> listaPlatos, int identificador) {
        super(identificador);
        this.nombre = nombre;
        this.costoTotal = costoTotal;
        this.listaPlatos.addAll(listaPlatos);
    }
   
    //Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public ArrayList<Plato> getListaPlatos() {
        return listaPlatos;
    }

    
    public void setListaPlatos(ArrayList<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }

    //toString
    @Override
    public String toString() {
        return "nombre=" + nombre + ", costoTotal=" + costoTotal + ", listaPlatos=" + listaPlatos + '}';
    }
    
    
    
    
    
}
