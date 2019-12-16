/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.dl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Valeria
 */
public class AccesoBD {
    
    private Connection conn = null;
    private Statement stmt = null;

    //driver = "com.mysql.jdbc.Driver"
    // url= jdbc:mysql://localhost/universidad?useSSL=false
    // user = prueba
    // pasword= ""
    public AccesoBD(String driver,String url, String user, String password) throws ClassNotFoundException, SQLException {
        //Class.forName(driver);
        conn = DriverManager.getConnection(url,user,password);
        stmt = conn.createStatement();
    }

    // Se usa para Insert, Update, Delete
    public void ejecutarSql(String query) throws Exception {
        stmt.executeUpdate(query);
    }

    // Este se usa para los select
    public ResultSet ejecutarQuery(String query) throws Exception {
        ResultSet rs = null;
        rs = stmt.executeQuery(query);
        return rs;
    }
    
}
