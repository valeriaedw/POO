/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Factory;

import com.proyecto.bl.Artistas.IArtistaDao;
import com.proyecto.bl.Artistas.SqlArtistaDao;
import com.proyecto.bl.Canciones.ICancionDao;
import com.proyecto.bl.Canciones.SqlCancionDao;
import com.proyecto.bl.Compositores.ICompositorDao;
import com.proyecto.bl.Compositores.SqlCompositorDao;
import com.proyecto.bl.Generos.IGeneroDao;
import com.proyecto.bl.Generos.SqlGeneroDao;
import com.proyecto.bl.Personas.IPersonaDao;
import com.proyecto.bl.Personas.SqlPersonaDao;



public class SqlDaoFactory extends DaoFactory{
    
    //devuleve instancia de sql dao aqui vienen de todos tipos d eobjetos
    public IPersonaDao getPersonaDao() {
        return new SqlPersonaDao();  
    }
    
    public ICancionDao getCancionDao(){
        return new SqlCancionDao();
    }

    @Override
    public IGeneroDao getGeneroDao() {
       return new SqlGeneroDao();
    }

    @Override
    public ICompositorDao getCompositorDao() {
       return new SqlCompositorDao();
    }

    @Override
    public IArtistaDao getArtistaDao() {
        
        return new SqlArtistaDao();
        
    }
    
}
