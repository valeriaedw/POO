
package com.tupuntodeventa.tl.Puestos;

import com.tupuntodeventa.bl.Factory.DaoFactory;
import com.tupuntodeventa.bl.Puesto.IPuestoDao;
import com.tupuntodeventa.bl.Puesto.Puesto;
import java.time.LocalDate;
import java.util.ArrayList;


public class PuestosController {
    
    private DaoFactory factory;
    private IPuestoDao puestoDao; 
      
    public void PuestosController (){
        
        factory = DaoFactory.getDaoFactory(1);
        puestoDao = factory.getpuestoDao();
        
    }
    
    public void registrarPuesto(String nombre, Float salarioBase, Float salarioNeto, Float bono, LocalDate fechaContratacion) throws Exception{
        Puesto puesto = new Puesto (nombre,salarioBase,salarioNeto,bono,fechaContratacion);
        puestoDao.insertar(puesto);
    }
    
    public ArrayList<Puesto> listarPuestos() throws Exception{
        
        return puestoDao.listar();        
    }
    
}
