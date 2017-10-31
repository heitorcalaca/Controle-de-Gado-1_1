/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitários;

import java.awt.Component;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

/**
 *
 * @author heito
 */
public class LimpaTelas {
     public void LimparCampos(JInternalFrame Frame) {     
            //limpa os campos     
            for (int i=0; i < Frame.getContentPane().getComponentCount(); i++) {   
                //varre todos os componentes     
                Component c = Frame.getContentPane().getComponent(i);     
                if (c instanceof JTextField) {                           
                    JTextField field = (JTextField) c;   
                    field.setText("");                      
                    }   
                }   
            }
}
/*for (int i = 0; i < getContentPane().getComponentCount(); i++) {
            Component c = getContentPane().getComponent(i);
            if (c instanceof JTextField) {
                JTextField field = (JTextField) c;
                field.setText("");
            }*/