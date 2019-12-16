
package com.tupuntodeventa.bl.Dirreccion;


public class Direccion {
    
    //Atributos
    private int idDireccion;
    private String direccionExacta;
    private String canton;
    private String distrito;
    private String provincia;
    private String distancia;
    
    
    //Constructor
    public Direccion(String direccionExacta, String canton, String distrito, String provincia, String distancia) {
        this.direccionExacta = direccionExacta;
        this.canton = canton;
        this.distrito = distrito;
        this.provincia = provincia;
        this.distancia = distancia;
    }
    
    //Get y Set
    public String getDireccionExacta() {
        return direccionExacta;
    }

    public void setDireccionExacta(String direccionExacta) {
        this.direccionExacta = direccionExacta;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }
    
    
    
    //toString
    @Override
    public String toString() {
        return "direccionExacta=" + direccionExacta + ", canton=" + canton + ", distrito=" + distrito + ", provincia=" + provincia + ", distancia=" + distancia + '}';
    }
    
    
    
    
    
}
