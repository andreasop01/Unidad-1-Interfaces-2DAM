/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatabla;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tarde
 */
public class AlumnosTableModel extends AbstractTableModel {
    
    private List<Alumno> listAlumno;
    private String[]columna={"Nombre","Curso"};
   
    public AlumnosTableModel(List<Alumno> l ){
        
        listAlumno=l;
    }

    @Override
    public int getRowCount() {
        return this.listAlumno.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return this.columna.length;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int indicefila, int indicecolumna) {
       switch (indicecolumna){
           case 0:
               return listAlumno.get(indicefila).getNombre();
           case 1:
               return listAlumno.get(indicecolumna).getCurso();
               
    }
       return null;     
            
    }

    @Override
    public String getColumnName(int column) {
        return this.columna[column];
    }
    
    
    
}
