/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitários;

import DAO.FilhotesDAO;
import JavaBeans.Filhotes;
import java.awt.TrayIcon;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author heito
 */
public class VerificaDesmama {

    public void verificaDesmama() {
        try {
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            GregorianCalendar calendar = new GregorianCalendar();
            java.sql.Date sqlDate = new java.sql.Date(calendar.getTimeInMillis());
            FilhotesDAO filhotesDAO = new FilhotesDAO();
            List<Filhotes> listaFilhotes = filhotesDAO.pesquisaDesmama();
            for (Filhotes f : listaFilhotes) {
                if (sqlDate.after(f.getDatadesmama()) && f.getSituacao().equals("NO")) {
                    JOptionPane.showMessageDialog(null, "EXISTEM ANIMAIS EM FASE DE DESMAMA");
                }

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
