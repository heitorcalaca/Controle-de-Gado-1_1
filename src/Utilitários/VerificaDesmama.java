/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitários;

import DAO.FilhotesDAO;
import Interfaces.Principal;
import JDBC.ConnectionFactory;
import JavaBeans.Filhotes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author heito
 */
public class VerificaDesmama {

    public Connection conecta;

    public VerificaDesmama() {
        this.conecta = new ConnectionFactory().conecta;
    }

    public void verificaDesmama() {
        try {

            String[] options = {"Ir para Relação de Desmama", "Sair"};
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            GregorianCalendar calendar = new GregorianCalendar();
            java.sql.Date sqlDate = new java.sql.Date(calendar.getTimeInMillis());
            FilhotesDAO filhotesDAO = new FilhotesDAO();
            List<Filhotes> listaFilhotes = filhotesDAO.pesquisaDesmama();
            for (Filhotes f : listaFilhotes) {
                if (sqlDate.after(f.getDatadesmama()) && f.getSituacao().equals("NO")) {

                    int resposta = JOptionPane.showOptionDialog(null, "EXISTEM ANIMAIS EM FASE DE DESMAMA", "ATENÇÃO", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                    if (resposta == JOptionPane.YES_OPTION) {
                        try {
                            String cmdsql = "SELECT * FROM filhotes where situacao = 'NO' and datadesmama <= CURRENT_DATE";
                            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
                            ResultSet rs = stmt.executeQuery();
                            JRResultSetDataSource relat = new JRResultSetDataSource(rs);
                            JasperPrint jp = JasperFillManager.fillReport(".\\rel\\Relatorio_Desmama.jasper", new HashMap(), relat);
                            JasperViewer jv = new JasperViewer(jp, false);
                            jv.setVisible(true);
                            rs.close();
                            stmt.close();
                        } catch (SQLException | JRException ex) {
                            JOptionPane.showMessageDialog(null, ex);
                        }
                    }
                } else {
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
