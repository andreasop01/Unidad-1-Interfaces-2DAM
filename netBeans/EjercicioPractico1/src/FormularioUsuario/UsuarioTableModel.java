/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormularioUsuario;
import FormularioUsuario.Usuario;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tarde
 */
public class UsuarioTableModel extends AbstractTableModel  {
    private ArrayList<Usuario> usuarios;
    private String[]columna={"Nombre","Apellido","Edad","Localidad"};
    
    public UsuarioTableModel(ArrayList<Usuario> listaUsuario){
        this.usuarios=listaUsuario;
    }
    @Override
    public int getRowCount() {
        return this.usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return this.columna.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        
        switch (columnIndex){
           case 0:
               return this.usuarios.get(rowIndex).getNombre();
           case 1:
               return this.usuarios.get(rowIndex).getApellido();
           case 2:
               return this.usuarios.get(rowIndex).getEdad();
           case 3:
               return this.usuarios.get(rowIndex).getProvincia();
        }     
        return null;   
    }
    
    public String getColumnName(int column){
        return this.columna[column];
        
    }
}
