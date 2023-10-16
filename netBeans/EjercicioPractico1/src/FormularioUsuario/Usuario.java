/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormularioUsuario;

/**
 *
 * @author Tarde
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private String provincia;

    public String[] toArrayString(){
        String datos[]={this.nombre,this.apellido,this.edad+"",this.provincia};
        return datos;
  }
    
    
    public Usuario(String nombre, String apellido, int edad, String provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.provincia = provincia;
    }
    
       public Usuario(){}
    
    

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
}


