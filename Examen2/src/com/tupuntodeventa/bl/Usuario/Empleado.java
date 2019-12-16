
package com.tupuntodeventa.bl.Usuario;

import com.tupuntodeventa.bl.Puesto.Puesto;
import java.time.LocalDate;


public class Empleado extends Usuario{
    
    //Atributos
    private Puesto puesto;
    
    //Constructor

    public Empleado(Puesto puesto, String id, String nombre, String primerApellido, String segundoApellido, String clave, String correo, String nombreUsuario, LocalDate fechaNacimiento, int edad, char genero, String telefono, String tipo) {
        super(id, nombre, primerApellido, segundoApellido, clave, correo, nombreUsuario, fechaNacimiento, edad, genero, telefono, tipo);
        this.puesto = puesto;
    }

    
    
   
    
    //Get y Set
    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    
    //toString

    @Override
    public String toString() {
        return "Empleado{" + "puesto=" + puesto + '}';
    }
    
    

    

    
}
