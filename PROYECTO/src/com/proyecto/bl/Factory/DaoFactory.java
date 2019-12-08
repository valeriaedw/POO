/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Factory;

import com.proyecto.bl.Canciones.ICancionDao;
import com.proyecto.bl.Compositores.ICompositorDao;
import com.proyecto.bl.Generos.IGeneroDao;
import com.proyecto.bl.Personas.IPersonaDao;


public abstract class DaoFactory {
    
    public static DaoFactory getDaoFactory(int tipo){
        switch (tipo){
            
            //es SqlServer
            case 1: return new SqlDaoFactory();
            // es MySql
            //case 2: return new SqlDaoFactory();
            //es Txt
            //case 3: return new TxtDaoFactory();

            default: return null;
        }
    }

    public abstract IPersonaDao getPersonaDao();
    public abstract ICancionDao getCancionDao();
    public abstract IGeneroDao getGeneroDao();
    public abstract ICompositorDao getCompositorDao();
    
    
}
