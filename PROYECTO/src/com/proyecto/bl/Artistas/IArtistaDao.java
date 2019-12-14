/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Artistas;


import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public interface IArtistaDao {
    
    public ArrayList <String> llenarGenero () throws Exception;
    public void insertarArtista (Artista artista) throws Exception;
    public ArrayList <Artista> listarArtista() throws Exception;
    public void modificarArtista (Artista artista) throws Exception;
    public void eliminarArtista(Artista artista) throws Exception;
    
}
