
package com.tupuntodeventa.bl.Usuario;

import com.tupuntodeventa.dl.AccesoBD;
import com.tupuntodeventa.dl.Conexion;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;


public class SqlUsuarioDao implements IUsuarioDao{
    String sql;
    
    @Override
    public void insertar(Usuario usuario) throws Exception {
        
        try {
            
            if (usuario instanceof Administrador){
                Administrador admin = (Administrador) usuario;
                sql="INSERT INTO USUARIO VALUES ('"+admin.getId()+"','"+admin.getNombre()+"','"+admin.getPrimerApellido()+"','"+admin.getSegundoApellido()+"','"+admin.getClave()+"','"+admin.getCorreo()+"','"+admin.getNombreUsuario()+"','"+admin.getFechaNacimiento()+"','"+admin.getEdad()+"','"+admin.getGenero()+"','"+admin.getTelefono()+"', 'admin')";
                
            }else if(usuario instanceof Empleado){
                Empleado empleado = (Empleado) usuario;
                sql = "INSERT INTO USUARIO ('"+empleado.getId()+"','"+empleado.getNombre()+"','"+empleado.getPrimerApellido()+"','"+empleado.getSegundoApellido()+"','"+empleado.getClave()+"','"+empleado.getCorreo()+"','"+empleado.getNombreUsuario()+"','"+empleado.getFechaNacimiento()+"','"+empleado.getEdad()+"','"+empleado.getGenero()+"','"+empleado.getTelefono()+"', 'empleado')";
                
            }else if(usuario instanceof Cliente){
                Cliente cliente = (Cliente) usuario;
                sql = "INSERT INTO USUARIO ('"+cliente.getId()+"','"+cliente.getNombre()+"','"+cliente.getPrimerApellido()+"','"+cliente.getSegundoApellido()+"','"+cliente.getClave()+"','"+cliente.getCorreo()+"','"+cliente.getNombreUsuario()+"','"+cliente.getFechaNacimiento()+"','"+cliente.getEdad()+"','"+cliente.getGenero()+"','"+cliente.getTelefono()+"', 'cliente')";   
            }
            
            AccesoBD acceso= Conexion.getConnector();
            acceso.ejecutarSql(sql);
              
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public ArrayList<Usuario> listar() throws Exception {
        ArrayList<Usuario> listarUsuarios = new ArrayList<>();
        
        try {
            
            ResultSet rs= null;
            Usuario usuario = null;
            sql = "SELECT * FROM USUARIO";
            rs = Conexion.getConnector().ejecutarQuery(sql);
            
            while (rs.next()){
                LocalDate fecha = rs.getDate("fecha_nacimiento").toLocalDate();
     
           
                usuario = new Usuario (rs.getString("id_usuario"),
                        rs.getString("nombre"),
                        rs.getString("primer_apellido"),
                        rs.getString("segundo_apellido"),
                        rs.getString("clave"),
                        rs.getString("correo"),
                        rs.getString("nombre_usuario"),
                        fecha,
                        rs.getInt("edad"),
                        rs.getString ("genero").charAt(0),
                        rs.getString("telefono"),
                        rs.getString("tipo"));
                
                listarUsuarios.add(usuario);
            }
    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
       return null;
    }

 
    
}
