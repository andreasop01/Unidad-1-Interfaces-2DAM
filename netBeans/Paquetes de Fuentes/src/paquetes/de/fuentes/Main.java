/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes.de.fuentes;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Tarde
 */
public class Main extends JFrame {

    /**
     * @param args the command line arguments
     */
    private JLabel idSaludo;
    public Main(){
        initFrame();
        initComponent();
    }
    public static void main(String[] args)
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void initFrame() {
        //To change body of generated methods, choose Tools | Templates.
        
        setSize(400,300);
        setTitle("Hola swing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
    }

    private void initComponent() {
       idSaludo=new JLabel("Hola swing2");
       idSaludo.setBounds(50,50,100,20);
       idSaludo.setOpaque(true);
       idSaludo.setForeground(Color.white);
       idSaludo.setBackground(Color.black);
       add(idSaludo);
       
    }
    
}
