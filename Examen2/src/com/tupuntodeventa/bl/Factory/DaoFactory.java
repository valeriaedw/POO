/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.bl.Factory;

import com.tupuntodeventa.bl.Combo.IComboDao;
import com.tupuntodeventa.bl.Cupon.ICuponDao;
import com.tupuntodeventa.bl.Orden.IOrdenDao;
import com.tupuntodeventa.bl.Plato.IPlatoDao;
import com.tupuntodeventa.bl.Puesto.IPuestoDao;
import com.tupuntodeventa.bl.Usuario.IUsuarioDao;

/**
 *
 * @author Valeria
 */
public abstract class DaoFactory {
    
    public static SqlDaoFactory getDaoFactory(int tipo){
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
    
    public abstract IUsuarioDao getusuarioDao();
    public abstract IPuestoDao getpuestoDao();
    public abstract ICuponDao getcuponDao();
    public abstract IPlatoDao getplatoDao();
    public abstract IComboDao getcomboDao();
    public abstract IOrdenDao getordenDao();
  
    
}
