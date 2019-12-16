/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.dl;

/**
 *
 * @author Valeria
 */
public class Conexion {
    
    private static AccesoBD conectorBD = null;
    
    private static final String URL_SQLSERVER = "jdbc:sqlserver://localhost;databaseName=examen";

    public static  AccesoBD getConnector() throws Exception{
        if(conectorBD == null) {
            conectorBD = new AccesoBD("com.sqlserver.jdbc.Driver", URL_SQLSERVER ,"examen", "examen");
        }
        return conectorBD;
    }
    
}
