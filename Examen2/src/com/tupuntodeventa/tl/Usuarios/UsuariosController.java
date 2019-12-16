/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tupuntodeventa.tl.Usuarios;

import com.tupuntodeventa.bl.Factory.DaoFactory;
import com.tupuntodeventa.bl.Puesto.IPuestoDao;
import com.tupuntodeventa.bl.Puesto.Puesto;
import com.tupuntodeventa.bl.Usuario.Administrador;
import com.tupuntodeventa.bl.Usuario.Cliente;
import com.tupuntodeventa.bl.Usuario.Empleado;
import com.tupuntodeventa.bl.Usuario.IUsuarioDao;
import com.tupuntodeventa.bl.Usuario.Usuario;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public class UsuariosController {
    
   
    private DaoFactory factory;
    private IUsuarioDao usuarioDao;
    
    
    public void UsuariosController (){
        
        factory = DaoFactory.getDaoFactory(1);
        usuarioDao = factory.getusuarioDao();  
    }
    
    public void registroAdmin(String id,String nombre, String primerApellido, String segundoApellido, String clave, String correo, String nombreUsuario, LocalDate fechaNacimiento, int edad, char genero, String telefono, String tipo) throws Exception{
        Administrador admin = new Administrador (id,nombre,primerApellido,segundoApellido,clave,correo,nombreUsuario,fechaNacimiento,edad,genero,telefono, tipo); 
        usuarioDao.insertar(admin);
    }
    

    public void registroEmpleado(Puesto puesto, String id, String nombre, String primerApellido, String segundoApellido, String clave, String correo, String nombreUsuario, LocalDate fechaNacimiento, int edad, char genero, String telefono, String tipo) throws Exception{
        Empleado empleado = new Empleado (puesto,id,nombre,primerApellido,segundoApellido,clave,correo,nombreUsuario,fechaNacimiento,edad,genero,telefono,tipo);   
        usuarioDao.insertar(empleado);
    }
    
    public void registroCliente(String direccionExacta, String canton, String distrito, String provincia, String distancia,String id, String nombre, String primerApellido, String segundoApellido, String clave, String correo, String nombreUsuario, LocalDate fechaNacimiento, int edad, char genero, String telefono, String tipo) throws Exception{
        Cliente cliente = new Cliente (direccionExacta,canton, distrito, provincia,distancia,id,nombre,primerApellido,segundoApellido,clave,correo,nombreUsuario,fechaNacimiento,edad,genero,telefono,tipo); 
        usuarioDao.insertar(cliente);
    }
    
    public ArrayList<Usuario> listarUsuario() throws Exception{

        
        return usuarioDao.listar();
              
    }
}
