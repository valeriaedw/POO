/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bl.Personas;

import com.proyecto.dl.AccesoBD;
import com.proyecto.dl.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;


public class SqlPersonaDao implements IPersonaDao{
    
    private String sql;
    
    
    public boolean existeAdmin(){
        ResultSet rs = null;
        boolean existe = false;
        try {
            String sql = "SELECT * FROM USUARIO WHERE TIPO = 'admin'";
            rs = Conexion.getConnector().ejecutarQuery(sql); 
           
            if(rs.next())
                existe = true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return existe;
    }
    
    public void insertar(Persona persona){
        try {
            
            if (persona instanceof Administrador){          
                sql = "INSERT INTO USUARIO (ID_USUARIO,NOMBRE,PRIMER_APELLIDO, SEGUNDO_APELLIDO,AVATAR, CORREO, NOMBRE_USUARIO, CONTRASENIA, TIPO) VALUES('"+ persona.getId()+"','"+ persona.getNombre()+"','"+persona.getApellido1()+ "','"+persona.getApellido2()+ "','"+persona.getAvatar()+ "','"+persona.getCorreo()+ "','"+persona.getNombreUsuario()+"','"+persona.getContrasenia()+"','admin')";   
            }else if(persona instanceof Cliente){
                    Cliente cliente = (Cliente)persona;
                    sql = "INSERT INTO USUARIO VALUES('"+cliente.getId()+"','" +cliente.getNombre()+"','"+cliente.getApellido1()+"','"+cliente.getApellido2()+"','"+cliente.getAvatar()+"','"+ cliente.getCorreo()+ "','"+cliente.getNombreUsuario()+"','"+persona.getContrasenia()+"','"+cliente.getFechaNacimiento()+"',"+cliente.getEdad()+",'"+cliente.getPais()+"','cliente')";   
               } 
            
               AccesoBD acceso = Conexion.getConnector();
               acceso.ejecutarSql(sql); 
               
         }catch (Exception e){
             e.printStackTrace();
         }   
    }
    //-------------------------------------------------------------------------------------------------------------------------------
  
    @Override
    public boolean buscarUsuario(String nombreUsuario, String contrasenia) throws Exception {
        ResultSet rs = null;
        try{
        String sql = "SELECT * FROM USUARIO "
                + "WHERE nombre_usuario = '"+nombreUsuario+"' and contrasenia = '"+contrasenia+"'";
        rs = Conexion.getConnector().ejecutarQuery(sql); //devolvemos lo de bd
        if(rs.next() != false){  
            System.out.println("Encontrado");
            return true;   
        }
        
        }
        catch(Exception ex){
            ex.printStackTrace();
            
        }  
        
        return false;
    }
   
    @Override
    public void eliminar(String id) throws Exception {
        
    }


    @Override
    public void modificar(Administrador admin) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void modificar(Cliente cliente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> listarC() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



   
}
