/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormularioCliente;

import java.util.Date;

/**
 *
 * @author Tarde
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private Date fechaAlta;
    private String provincia;
    
    
    public String[] toArrayString(){
        String datos[]={this.nombre,this.apellido,this.fechaAlta.toString(),this.provincia};
        return datos;
    } 
    public Usuario(String nombre, String apellido, Date fechaAlta, String provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaAlta = fechaAlta;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date  fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
    
    
}
