
package com.tupuntodeventa.bl.Orden;


import com.tupuntodeventa.bl.Producto.Producto;
import com.tupuntodeventa.bl.Usuario.Empleado;
import java.time.LocalTime;
import java.util.ArrayList;

public class Llevar extends Orden{
    
    //private Cupon cupon;

    public Llevar(String nombre, String apellidos, LocalTime hora, String tipoOrden, Empleado empleado, ArrayList<Producto> productos, Float precio) {
        super(nombre, apellidos, hora, tipoOrden, empleado, productos, precio);
        
    }
    
   
    
    //Get y set
   
    
    //toString

    @Override
    public String toString() {
        return super.toString();
    }

 
  
    
    
    
  
}
