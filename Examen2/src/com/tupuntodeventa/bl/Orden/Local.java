/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.bl.Orden;

import com.tupuntodeventa.bl.Producto.Producto;
import com.tupuntodeventa.bl.Usuario.Empleado;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public class Local extends Orden{

    public Local(String nombre, String apellidos, LocalTime hora, String tipoOrden, Empleado empleado, ArrayList<Producto> productos, Float precio) {
        super(nombre, apellidos, hora, tipoOrden, empleado, productos, precio);
    }
    
   
    
}
