
package com.tupuntodeventa.tl.Ordenes;

import com.tupuntodeventa.bl.Cupon.Cupon;
import com.tupuntodeventa.bl.Factory.DaoFactory;
import com.tupuntodeventa.bl.Orden.IOrdenDao;
import com.tupuntodeventa.bl.Orden.Llevar;
import com.tupuntodeventa.bl.Orden.Local;
import com.tupuntodeventa.bl.Orden.Remoto;
import com.tupuntodeventa.bl.Producto.Producto;
import com.tupuntodeventa.bl.Usuario.Empleado;
import com.tupuntodeventa.bl.Usuario.Usuario;
import java.time.LocalTime;
import java.util.ArrayList;


public class OrdenesController {
    
    private IOrdenDao ordenDao;
    private DaoFactory factory;
    
    public OrdenesController(){
        
        factory = DaoFactory.getDaoFactory(1);
        ordenDao = factory.getordenDao();  
    }
    
    public void registraOrdenLocal(String nombre, String apellidos, LocalTime hora, String tipoOrden, Empleado empleado, ArrayList<Producto> productos, Float precio) throws Exception{
        
        Local local = new Local (nombre,apellidos,hora,"local",empleado,productos,precio);
        ordenDao.insertar(local);
    }
    
    public void registraOrdenLlevar(String nombre, String apellidos, LocalTime hora, String tipoOrden, Empleado empleado, ArrayList<Producto> productos, Float precio) throws Exception{
        
        Llevar llevar = new Llevar (nombre,apellidos,hora,"llevar",empleado,productos,precio);
        ordenDao.insertar(llevar);
    }
    
    public void registraOrdenRemota(Cupon cupon, Usuario idUsuario, String nombre, String apellidos, LocalTime hora, String tipoOrden, Empleado empleado, ArrayList<Producto> productos, Float precio) throws Exception{
        
        Remoto remot = new Remoto (cupon,idUsuario,nombre,apellidos,hora,"remot",empleado,productos,precio);
        ordenDao.insertar(remot);
    }
    
    
    
    
        
     
    
    
    
}
