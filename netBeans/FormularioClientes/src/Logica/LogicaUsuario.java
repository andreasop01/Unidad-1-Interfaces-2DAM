/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import FormularioCliente.Usuario;
import java.util.ArrayList;


/**
 *
 * @author Tarde
 */
public class LogicaUsuario {
    
    private static ArrayList<Usuario> listaUsuario=new ArrayList();
    
    public static void nuevoUsuario(Usuario usuario){
        listaUsuario.add(usuario);
        
    }
    
    public static ArrayList<Usuario> getListaUsuario(){
        return listaUsuario;
    }
    
}
