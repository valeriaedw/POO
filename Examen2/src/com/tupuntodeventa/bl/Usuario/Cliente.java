
package com.tupuntodeventa.bl.Usuario;

import com.tupuntodeventa.bl.Dirreccion.Direccion;
import java.time.LocalDate;


public class Cliente extends Usuario{
    
    //Atributo
   
    private Direccion direccion;
  
    
    //Constructor
    public Cliente(String direccionExacta, String canton, String distrito, String provincia, String distancia,String id, String nombre, String primerApellido, String segundoApellido, String clave, String correo, String nombreUsuario, LocalDate fechaNacimiento, int edad, char genero, String telefono, String tipo) {    
        super(id,nombre, primerApellido, segundoApellido, clave, correo, nombreUsuario, fechaNacimiento, edad, genero, telefono, tipo);
        this.direccion = new Direccion(direccionExacta,canton, distrito, provincia, distancia);
    }

    //Get y Set
 
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
    
    //ToString

    @Override
    public String toString() {
        return "Cliente{" + "direccion=" + direccion + '}';
    }
    
   
    
    
    
}
