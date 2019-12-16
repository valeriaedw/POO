/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.tl.Combos;

import com.tupuntodeventa.bl.Combo.Combo;
import com.tupuntodeventa.bl.Combo.IComboDao;
import com.tupuntodeventa.bl.Factory.DaoFactory;
import com.tupuntodeventa.bl.Plato.IPlatoDao;
import com.tupuntodeventa.bl.Plato.Plato;
import java.util.ArrayList;

   
public class CombosController {
    
    private DaoFactory factory;
    private IComboDao comboDao;
    private IPlatoDao platoDao;
    
    public void CombosController (){
        factory = DaoFactory.getDaoFactory(1);
        comboDao = factory.getcomboDao();
        platoDao = factory.getplatoDao();
    }
    
    public void registraCombo(String nombre, float costoTotal, ArrayList<Plato> listaPlatos, int identificador) throws Exception{
      
        //Recorro arraylist y los agrego a platos
        for (Plato listaPlato : listaPlatos){
           platoDao.insertar(listaPlato);    
        }

        Combo combo = new Combo (nombre, costoTotal, listaPlatos,identificador);
        comboDao.insertar(combo);
        
    }
    
}
