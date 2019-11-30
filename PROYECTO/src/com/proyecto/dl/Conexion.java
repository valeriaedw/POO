/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dl;


public class Conexion {
    
    private static AccesoBD conectorBD = null;
    
    private static final String URL_SQLSERVER = "jdbc:sqlserver://localhost;databaseName=proyecto";

    public static  AccesoBD getConnector() throws Exception{
        if(conectorBD == null) {
            conectorBD = new AccesoBD("com.sqlserver.jdbc.Driver", URL_SQLSERVER ,"proyecto", "proyecto");
        }
        return conectorBD;
    }
    
}
