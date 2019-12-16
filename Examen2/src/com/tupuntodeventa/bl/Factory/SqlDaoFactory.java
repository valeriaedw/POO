/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.bl.Factory;

import com.tupuntodeventa.bl.Combo.IComboDao;
import com.tupuntodeventa.bl.Combo.SqlComboDao;
import com.tupuntodeventa.bl.Cupon.ICuponDao;
import com.tupuntodeventa.bl.Cupon.SqlCuponDao;
import com.tupuntodeventa.bl.Orden.IOrdenDao;
import com.tupuntodeventa.bl.Orden.SqlOrdenDao;
import com.tupuntodeventa.bl.Plato.IPlatoDao;
import com.tupuntodeventa.bl.Plato.SqlPlatoDao;
import com.tupuntodeventa.bl.Puesto.IPuestoDao;
import com.tupuntodeventa.bl.Puesto.SqlPuestoDao;
import com.tupuntodeventa.bl.Usuario.IUsuarioDao;
import com.tupuntodeventa.bl.Usuario.SqlUsuarioDao;

/**
 *
 * @author Valeria
 */
public class SqlDaoFactory extends DaoFactory{

    @Override
    public IUsuarioDao getusuarioDao() {
       return new SqlUsuarioDao();
    }

    @Override
    public IPuestoDao getpuestoDao() {
        return new SqlPuestoDao();
    }

    @Override
    public ICuponDao getcuponDao() {
        return new SqlCuponDao();
    }

    @Override
    public IPlatoDao getplatoDao() {
        return new SqlPlatoDao();
    }

    @Override
    public IComboDao getcomboDao() {
        
        return new SqlComboDao();
        
    }

    @Override
    public IOrdenDao getordenDao() {
        return new SqlOrdenDao();
    }
    
}
