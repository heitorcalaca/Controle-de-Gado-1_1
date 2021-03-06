package Interfaces;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Locale;
import Utilitários.VerificaDesmama;
import Utilitários.numerosLivres;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

// Para fazer o calculo da data de desmama utilize a classe Calendar cal = GregorianCalendar.getInstance();!!!!!
public class Principal extends javax.swing.JFrame {

    public Connection conecta;

    public static JDesktopPane getPainel() {

        return Principal.jdpPrincipal;

    }

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        this.conecta = new ConnectionFactory().conecta;
        Locale locale = new Locale("pt", "Br");
        JOptionPane.setDefaultLocale(locale);
    }

    numerosLivres numerosLivres = new numerosLivres();

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_menu = new javax.swing.JMenu();
        menu_matrizes = new javax.swing.JMenu();
        menuitem_novaMatriz = new javax.swing.JMenuItem();
        menuitem_matrizes = new javax.swing.JMenuItem();
        menu_caracteristicas = new javax.swing.JMenu();
        menuitem_novacaracteristica = new javax.swing.JMenuItem();
        menuitem_caracteristicas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuitem_novofilhote = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        relMatrizes = new javax.swing.JMenuItem();
        relCaracterísticas = new javax.swing.JMenuItem();
        relDesmama = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuItem_NovoMacho = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpPrincipal.setInheritsPopupMenu(true);
        jdpPrincipal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jdpPrincipalAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1166, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        menu_menu.setText("Menu");

        menu_matrizes.setText("Matrizes");

        menuitem_novaMatriz.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuitem_novaMatriz.setText("Nova Matriz");
        menuitem_novaMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_novaMatrizActionPerformed(evt);
            }
        });
        menu_matrizes.add(menuitem_novaMatriz);

        menuitem_matrizes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menuitem_matrizes.setText("Matrizes");
        menuitem_matrizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_matrizesActionPerformed(evt);
            }
        });
        menu_matrizes.add(menuitem_matrizes);

        menu_caracteristicas.setText("Características");

        menuitem_novacaracteristica.setText("Nova Característica");
        menuitem_novacaracteristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_novacaracteristicaActionPerformed(evt);
            }
        });
        menu_caracteristicas.add(menuitem_novacaracteristica);

        menuitem_caracteristicas.setText("Características");
        menuitem_caracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_caracteristicasActionPerformed(evt);
            }
        });
        menu_caracteristicas.add(menuitem_caracteristicas);

        menu_matrizes.add(menu_caracteristicas);

        menu_menu.add(menu_matrizes);

        jMenu1.setText("Filhotes");

        menuitem_novofilhote.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        menuitem_novofilhote.setText("Novo Filhote");
        menuitem_novofilhote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_novofilhoteActionPerformed(evt);
            }
        });
        jMenu1.add(menuitem_novofilhote);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem1.setText("Desmamar Filhote");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Baixa de Filhote");
        jMenu1.add(jMenuItem2);

        menu_menu.add(jMenu1);

        jMenu2.setText("Relatórios");

        relMatrizes.setText("Matrizes");
        relMatrizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relMatrizesActionPerformed(evt);
            }
        });
        jMenu2.add(relMatrizes);

        relCaracterísticas.setText("Características");
        relCaracterísticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relCaracterísticasActionPerformed(evt);
            }
        });
        jMenu2.add(relCaracterísticas);

        relDesmama.setText("Desmama");
        relDesmama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relDesmamaActionPerformed(evt);
            }
        });
        jMenu2.add(relDesmama);

        menu_menu.add(jMenu2);

        jMenu3.setText("Machos");

        menuItem_NovoMacho.setText("Novo Macho");
        menuItem_NovoMacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_NovoMachoActionPerformed(evt);
            }
        });
        jMenu3.add(menuItem_NovoMacho);

        menu_menu.add(jMenu3);

        jMenuBar1.add(menu_menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );

        setBounds(0, 0, 1182, 728);
    }// </editor-fold>//GEN-END:initComponents


    private void menuitem_novaMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_novaMatrizActionPerformed
        NovaMatriz obj = new NovaMatriz();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
        obj.setPosicao();
    }//GEN-LAST:event_menuitem_novaMatrizActionPerformed

    private void menuitem_matrizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_matrizesActionPerformed
        ListaMatrizes obj = new ListaMatrizes();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
        obj.setPosicao();
    }//GEN-LAST:event_menuitem_matrizesActionPerformed

    private void menuitem_novacaracteristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_novacaracteristicaActionPerformed
        NovaCaracteristica obj = new NovaCaracteristica();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
        obj.setPosicao();
    }//GEN-LAST:event_menuitem_novacaracteristicaActionPerformed

    private void menuitem_caracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_caracteristicasActionPerformed
        ListaCaracteristicas obj = new ListaCaracteristicas();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
        obj.setPosicao();
    }//GEN-LAST:event_menuitem_caracteristicasActionPerformed

    private void menuitem_novofilhoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_novofilhoteActionPerformed
        NovoFilhote obj = new NovoFilhote();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
        obj.setPosicao();
    }//GEN-LAST:event_menuitem_novofilhoteActionPerformed

    private void relMatrizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relMatrizesActionPerformed

        try {
            String cmdsql = "select * from matrizes";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            ResultSet rs = stmt.executeQuery();
            JRResultSetDataSource relat = new JRResultSetDataSource(rs);
            JasperPrint jp = JasperFillManager.fillReport(".\\rel\\Relatorio_Matrizes.jasper", new HashMap(), relat);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            rs.close();
            stmt.close();
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(this.rootPane, ex);
        }
    }//GEN-LAST:event_relMatrizesActionPerformed

    private void relCaracterísticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relCaracterísticasActionPerformed
        try {
            String cmdsql = "Select * from caracteristicas";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            ResultSet rs = stmt.executeQuery();
            JRResultSetDataSource relat = new JRResultSetDataSource(rs);
            JasperPrint jp = JasperFillManager.fillReport(".\\rel\\Caracteristicas.jasper", new HashMap(), relat);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            rs.close();
            stmt.close();
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(this.rootPane, ex);
        }

    }//GEN-LAST:event_relCaracterísticasActionPerformed

    private void jdpPrincipalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jdpPrincipalAncestorAdded
        // TODO add your handling code here:
        VerificaDesmama vd = new VerificaDesmama();
        vd.verificaDesmama();
    }//GEN-LAST:event_jdpPrincipalAncestorAdded

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        DesmamaFilhote df = new DesmamaFilhote();
        jdpPrincipal.add(df);
        df.setVisible(true);
        df.setPosicao();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void relDesmamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relDesmamaActionPerformed
        // TODO add your handling code here:
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
            JOptionPane.showMessageDialog(this.rootPane, ex);
        }
    }//GEN-LAST:event_relDesmamaActionPerformed

    private void menuItem_NovoMachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_NovoMachoActionPerformed
        // TODO add your handling code here:
        NovoMacho obj = new NovoMacho();
        jdpPrincipal.add(obj);
        obj.setVisible(true);
        obj.setPosicao();
    }//GEN-LAST:event_menuItem_NovoMachoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ParseException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });

        try {
            Connection con = new ConnectionFactory().conecta;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados\n" + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenuItem menuItem_NovoMacho;
    private javax.swing.JMenu menu_caracteristicas;
    private javax.swing.JMenu menu_matrizes;
    private javax.swing.JMenu menu_menu;
    private javax.swing.JMenuItem menuitem_caracteristicas;
    private javax.swing.JMenuItem menuitem_matrizes;
    private javax.swing.JMenuItem menuitem_novaMatriz;
    private javax.swing.JMenuItem menuitem_novacaracteristica;
    private javax.swing.JMenuItem menuitem_novofilhote;
    private javax.swing.JMenuItem relCaracterísticas;
    private javax.swing.JMenuItem relDesmama;
    private javax.swing.JMenuItem relMatrizes;
    // End of variables declaration//GEN-END:variables
}
