
package com.proyecto.bl.Personas;


public class Persona {
    
    //Atributos
    protected String id;
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String avatar;
    protected String correo;
    protected String nombreUsuario;
    protected String contrasenia;
    protected String tipo;
    
    //Construtor
    public Persona(){
            
    }
    
    //Constructor
    public Persona(String id, String nombre, String apellido1, String apellido2, String avatar, String correo, String nombreUsuario, String contrasenia, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.avatar = avatar;
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.tipo = tipo;
    }
    
    //Get y Set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //toString
    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", avatar=" + avatar + ", correo=" + correo + ", nombreUsuario=" + nombreUsuario + ", contrasenia=" + contrasenia + ", tipo=" + tipo + '}';
    }
    
    
    
    

    
    
    
    
}
