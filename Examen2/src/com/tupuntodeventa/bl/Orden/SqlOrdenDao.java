/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.bl.Orden;

import com.tupuntodeventa.dl.AccesoBD;
import com.tupuntodeventa.dl.Conexion;
import java.sql.ResultSet;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public class SqlOrdenDao implements IOrdenDao {

    String sql;

    @Override
    public void insertar(Orden orden) throws Exception {

        try {
            if (orden instanceof Local) {
                Local local = (Local) orden;
                sql = "INSERT INTO ORDEN (NOMBRE,APELLIDO, HORA, TIPO, ID_EMPLEADO, PRECIO) VALUES ('" + local.getNombre() + "','" + local.getApellidos() + "','" + local.getHora() + "','local','" + local.getEmpleado() + "','" + local.getPrecio() + "')";
            } else if (orden instanceof Llevar) {
                Llevar llevar = (Llevar) orden;
                sql = "INSERT INTO ORDEN (NOMBRE,APELLIDO, HORA, TIPO, ID_EMPLEADO, PRECIO) VALUES ('" + llevar.getNombre() + "','" + llevar.getApellidos() + "','" + llevar.getHora() + "','llevar','" + llevar.getEmpleado() + "','" + llevar.getPrecio() + "')";
            } else if (orden instanceof Remoto) {
                Remoto remot = (Remoto) orden;
                sql = "INSERT INTO ORDEN (NOMBRE,APELLIDO, HORA, TIPO, ID_EMPLEADO, PRECIO) VALUES ('" + remot.getNombre() + "','" + remot.getApellidos() + "','" + remot.getHora() + "','remot','" + remot.getIdUsuario() + "','" + remot.getPrecio() + "','" + remot.getCupon() + "')";
            }

            AccesoBD acceso = Conexion.getConnector();
            acceso.ejecutarSql(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public ArrayList<Orden> listar() throws Exception {
        /**ArrayList<Orden> listarOrden = new ArrayList();

        try {

            ResultSet rs = null;
            Orden orden = null;
            sql = "SELECT * FROM ORDEN WHERE TIPO= "+"remot"+"";
            rs = Conexion.getConnector().ejecutarQuery(sql);
            
            while(rs.next()){
                
                LocalTime hora =rs.getTime("hora").toLocalTime();
                
                orden = new Orden (rs.getString("nombre"),
                    rs.getString("apellido"),
                    hora,
                    rs.getString("tipo"),
                    rs.getString("id_empleado"), //idUsuario
                    rs.getString("precio"),
                    rs.getString("id_cupo"));
                         
            }
            
        } catch (Exception e) {
        }*/

        return null;
    }
        
        

}
