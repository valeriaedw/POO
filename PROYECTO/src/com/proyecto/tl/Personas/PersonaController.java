/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.tl.Personas;

import com.proyecto.bl.Factory.DaoFactory;
import com.proyecto.bl.Personas.Administrador;
import com.proyecto.bl.Personas.Cliente;
import com.proyecto.bl.Personas.IPersonaDao;

import java.sql.Date;
import java.time.LocalDate;
//dao . admin 

public class PersonaController {
    
    private IPersonaDao personaDao;
    private DaoFactory factory;
   

    public PersonaController() {
        
        factory = DaoFactory.getDaoFactory(1);
        personaDao = factory.getPersonaDao();   
    }
    
    public void registroUsuario (String id, String nombre, String apellido1, String apellido2, String avatar, String correo, String nombreUsuario, String contrasenia, LocalDate fechaNacimiento, int edad, String pais, String tipo){
        
       try{
           if(!personaDao.existeAdmin()){
                   
            Administrador admin = new Administrador (id,nombre,apellido1,apellido2, avatar, correo,nombreUsuario,contrasenia,tipo);
            personaDao.insertar(admin);
           
            }else{
                
            Cliente cliente = new Cliente (id,nombre,apellido1,apellido2, avatar,correo,nombreUsuario,contrasenia,fechaNacimiento,edad,pais,tipo);
            personaDao.insertar(cliente);   
            }
       }catch(Exception e){
           
           e.printStackTrace();   
       }    
    }
    
    public boolean validarAdmin () throws Exception{
        
        return personaDao.existeAdmin();
        
    }
    
    public boolean loginUsuario (String nombreUsuario, String contrasenia){
       boolean login = false; 
       try{
        login = personaDao.buscarUsuario(nombreUsuario, contrasenia);
       
       }catch(Exception e){
           
           e.printStackTrace();  
       }   
       
       return login;
    }
    
    
    
    
}
