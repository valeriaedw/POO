
package com.tupuntodeventa.bl.Orden;

import com.tupuntodeventa.bl.Producto.Producto;
import com.tupuntodeventa.bl.Usuario.Empleado;
import java.time.LocalTime;
import java.util.ArrayList;

public class Orden {
    
    //Atributos
    private int id;
    private String nombre;
    private String apellidos;
    private LocalTime hora;
    private String tipoOrden;
    private Empleado empleado;
    private ArrayList<Producto> productos;
    private Float precio;
    
    //Constructor
    public Orden() {
      
    }

    public Orden(String nombre, String apellidos, LocalTime hora, String tipoOrden, Empleado empleado, ArrayList<Producto> productos, Float precio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.hora = hora;
        this.tipoOrden = tipoOrden;
        this.empleado = empleado;
        this.productos.addAll(productos);
        this.precio = precio;
    }
    
    //Get y Set
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getTipoOrden() {
        return tipoOrden;
    }

    public void setTipoOrden(String tipoOrden) {
        this.tipoOrden = tipoOrden;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {    
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    //toString
    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellidos=" + apellidos + ", hora=" + hora + ", tipoOrden=" + tipoOrden + ", empleado=" + empleado + '}';
    }
    
    
    
    
    
    
}
