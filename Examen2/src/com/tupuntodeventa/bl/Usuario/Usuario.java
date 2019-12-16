
package com.tupuntodeventa.bl.Usuario;

import java.time.LocalDate;


public class Usuario {
    
    //Atributos  
    private String id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String clave;
    private String correo;
    private String nombreUsuario;
    private LocalDate fechaNacimiento;
    private int edad;
    private char genero;
    private String telefono;
    private String tipo;
    
    //Constructor

    public Usuario(String id,String nombre, String primerApellido, String segundoApellido, String clave, String correo, String nombreUsuario, LocalDate fechaNacimiento, int edad, char genero, String telefono, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.clave = clave;
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.genero = genero;
        this.telefono = telefono;
        this.tipo = tipo;
    }
    
    
    //Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    //ToString
    @Override
    public String toString() {
        return "nombre=" + nombre + ", clave=" + clave + ", correo=" + correo + ", nombreUsuario=" + nombreUsuario + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", genero=" + genero + ", telefono=" + telefono + '}';
    }
    
    
    
    
}
