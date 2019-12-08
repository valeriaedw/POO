/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Generos;

import com.proyecto.dl.AccesoBD;
import com.proyecto.dl.Conexion;
import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public class SqlGeneroDao implements IGeneroDao {

    private String sql;

    @Override
    public void insertarGenero(Genero genero) throws Exception {
        try {

            sql = "INSERT INTO GENERO(NOMBRE,DESCRIPCION)VALUES('" + genero.getNombre() + "','" + genero.getDescripcion() + "')";
            AccesoBD acceso = Conexion.getConnector();
            acceso.ejecutarSql(sql);

        } catch (Exception e) {
            
            throw new Exception("Error al intentar registar un genero: " + e.getMessage());

        }

    }

    @Override
    public ArrayList<Genero> listarGenero() throws Exception {

        return null;
    }

    @Override
    public void modificarGenero(Genero genero) throws Exception {

    }

    @Override
    public void eliminarGenero(Genero genero) throws Exception {

    }

}
