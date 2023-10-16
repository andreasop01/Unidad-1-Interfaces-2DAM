/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatabla;

import java.util.ArrayList;
import java.util.List;





/**
 *
 * @author Tarde
 */
public class LogicaAlumno {
    List <Alumno> ListaAlumnos=new ArrayList<Alumno>();
    
    private  void addAlumnos(Alumno a){
        
        ListaAlumnos.add(a);
    
    }
    public List<Alumno> getAlumnos(){
        return this.ListaAlumnos;
    }
    
}
