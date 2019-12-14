/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Artistas;

import com.proyecto.dl.AccesoBD;
import com.proyecto.dl.Conexion;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public class SqlArtistaDao implements IArtistaDao {

    private String sql;

    @Override
    public ArrayList<String> llenarGenero() throws Exception {
        ArrayList<String> generos = new ArrayList<String>();
        try {
            ResultSet rs = null;
            sql = "SELECT NOMBRE FROM GENERO";
            rs = Conexion.getConnector().ejecutarQuery(sql);

            while (rs.next()) {
                String genero = rs.getString("nombre");
                // add group names to the array list
                generos.add(genero);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return generos;
    }

    @Override
    public void insertarArtista(Artista artista) throws Exception {

        try {

            sql = "INSERT INTO ARTISTA (NOMBRE, APELLIDO, NOMBRE_ARTISTICO, FECHA_NACIMIENTO, FECHA_DEFUNCION, EDAD, PAIS, GENERO, DESCRIPCION) "
                    + "VALUES ('" + artista.getNombre() + "','" + artista.getApellido() + "','" + artista.getNombreArtistico() + "','" + artista.getFechaNacimiento() + "','" + artista.getFechaDefuncion() + "'," + artista.getEdad() + ",'" + artista.getPaisNacimiento() + "','" + artista.getGenero() + "','" + artista.getDescripcion() + "')";

            AccesoBD acceso = Conexion.getConnector();
            acceso.ejecutarSql(sql);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Artista> listarArtista() throws Exception {
        ArrayList<Artista> listaArtista = new ArrayList<>();
        try {

            ResultSet rs = null;
            Artista artista = null;
            sql = "SELECT NOMBRE, APELLIDO, NOMBRE_ARTISTICO, FECHA_NACIMIENTO, FECHA_DEFUNCION, EDAD, PAIS, GENERO, DESCRIPCION FROM ARTISTA";
            rs = Conexion.getConnector().ejecutarQuery(sql);

            while (rs.next()) {
                LocalDate fechaNacimiento = rs.getDate("fecha_nacimiento").toLocalDate();
                LocalDate fechaDefuncion = rs.getDate("fecha_defuncion").toLocalDate();

                artista = new Artista(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("nombre_artistico"),
                        fechaNacimiento,
                        fechaDefuncion,
                        rs.getInt("edad"),
                        rs.getString("pais"),
                        rs.getString("genero"),
                        rs.getString("descripcion"));       
                
                listaArtista.add(artista);
               
            }
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        return listaArtista;
    }

    @Override
    public void modificarArtista(Artista artista) throws Exception {

    }

    @Override
    public void eliminarArtista(Artista artista) throws Exception {

    }

}
