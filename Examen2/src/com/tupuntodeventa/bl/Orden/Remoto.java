
package com.tupuntodeventa.bl.Orden;

import com.tupuntodeventa.bl.Cupon.Cupon;
import com.tupuntodeventa.bl.Producto.Producto;
import com.tupuntodeventa.bl.Usuario.Empleado;
import com.tupuntodeventa.bl.Usuario.Usuario;
import java.time.LocalTime;
import java.util.ArrayList;


public class Remoto extends Llevar{
     
    private Cupon cupon;
    private Usuario idUsuario;

    public Remoto(Cupon cupon, Usuario idUsuario, String nombre, String apellidos, LocalTime hora, String tipoOrden, Empleado empleado, ArrayList<Producto> productos, Float precio) {
        super(nombre, apellidos, hora, tipoOrden, empleado, productos, precio);
        this.cupon = cupon;
        this.idUsuario = idUsuario;
    }

    public Cupon getCupon() {
        return cupon;
    }

    public void setCupon(Cupon cupon) {
        this.cupon = cupon;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    

    @Override
    public String toString() {
        return "Remoto{" + "cupon=" + cupon + '}';
    }
    
   

    

    

    
    
    
    
}
