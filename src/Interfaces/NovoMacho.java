/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.CaracteristicasDAO;
import DAO.FilhotesDAO;
import DAO.MachosDAO;
import JavaBeans.Caracteristicas;
import JavaBeans.Filhotes;
import JavaBeans.Machos;
import Utilitários.Listar;
import java.awt.Component;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author heito
 */
public class NovoMacho extends javax.swing.JInternalFrame {

    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Creates new form NovaMatriz
     */
    public NovoMacho() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtlote = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnomemae = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtproprietario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbcaracteristicas = new javax.swing.JComboBox();
        botaosalvar = new javax.swing.JButton();
        botaosair = new javax.swing.JButton();
        txtnomepai = new javax.swing.JTextField();
        cmbsituação = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtdatanascimento = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Novo Macho Desmamado");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel7.setText("Nome da Mãe");

        jLabel2.setText("Número");

        jLabel3.setText("Características");

        jLabel4.setText("Data de Nascimento");

        jLabel5.setText("Proprietário");

        jLabel6.setText("Nome do Pai");

        jLabel1.setText("LOTE");

        botaosalvar.setText("Salvar");
        botaosalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosalvarActionPerformed(evt);
            }
        });

        botaosair.setText("Sair");
        botaosair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosairActionPerformed(evt);
            }
        });

        cmbsituação.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO ", "VE", "MO", "SU" }));

        jLabel8.setText("Situação");

        try {
            MaskFormatter mascara = new MaskFormatter("##/##/####");
            mascara.setPlaceholderCharacter('_');
            txtdatanascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaosalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaosair, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtnumero, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addGap(138, 138, 138)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtdatanascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtlote, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtnomemae, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtproprietario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbcaracteristicas, 0, 310, Short.MAX_VALUE)
                                    .addComponent(txtnomepai))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbsituação, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(txtnumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtlote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cmbcaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdatanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbsituação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtproprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtnomepai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtnomemae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaosair)
                    .addComponent(botaosalvar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void botaosalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosalvarActionPerformed
        MachosDAO dao = new MachosDAO();
        String numero = txtnumero.getText();
        if (txtlote.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.rootPane, "O campo Lote é obrigatório");
            txtlote.grabFocus();
        } else if (txtnumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.rootPane, "O campo Numero é obrigatório");
            txtnumero.grabFocus();
        } else if (txtnumero.getText().length() < 3) {
            JOptionPane.showMessageDialog(this.rootPane, "Insira um número com 3 ou mais dígitos");
            txtnumero.grabFocus();
        } else if (dao.verificarNumero(numero) == true) {
            JOptionPane.showMessageDialog(this.rootPane, "O numero '" + txtnumero.getText() + "' já está cadastrado");
            DesmamaFilhote.txtnumero.grabFocus();
            txtnumero.setText("");
        } else if (txtproprietario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.rootPane, "O campo Proprietário é obrigatório");
            txtproprietario.grabFocus();
        } else {
            try {
                //botão salvar

                //1 passo - guardar os dados da tela no obj matrizes
                Machos obj = new Machos();
                obj.setNumero(txtnumero.getText());
                obj.setLote(txtlote.getText());
                obj.setCaracteristica((String) cmbcaracteristicas.getSelectedItem().toString());
                Date data = formatoData.parse(txtdatanascimento.getText());
                java.sql.Date dataSql = new java.sql.Date(data.getTime());
                obj.setDatanascimento(dataSql);
                obj.setProprietario(txtproprietario.getText());
                obj.setNomemae(txtnomemae.getText());
                obj.setSituacao((String) cmbsituação.getSelectedItem());

                //2 pass0 - criar objeto do tipo matrizesDAO
                dao.cadastrarMachoNovo(obj);

                JOptionPane.showMessageDialog(this.rootPane, "Cadastro Realizado com Sucesso!");
            } catch (Exception erro) {
                throw new RuntimeException(erro);

            }
            //limpar tela
            for (int i = 0; i < getContentPane().getComponentCount(); i++) {
                Component c = getContentPane().getComponent(i);
                if (c instanceof JTextField) {
                    JTextField field = (JTextField) c;
                    field.setText("");
                }
            }

        }
    }//GEN-LAST:event_botaosalvarActionPerformed
    private void botaosairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosairActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaosairActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // Listar Caracteristicas

        try {
            CaracteristicasDAO dao = new CaracteristicasDAO();
            List<Caracteristicas> lista = dao.ListarCaracteristicas();
            for (Caracteristicas c : lista) {
                String cr = c.getCaracteristicas().replaceAll("a\\b", "o");
                cmbcaracteristicas.addItem(cr);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    public void idFihlote() {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaosair;
    private javax.swing.JButton botaosalvar;
    public static javax.swing.JComboBox cmbcaracteristicas;
    private javax.swing.JComboBox<String> cmbsituação;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JFormattedTextField txtdatanascimento;
    public static javax.swing.JTextField txtlote;
    public static javax.swing.JTextField txtnomemae;
    public static javax.swing.JTextField txtnomepai;
    public static javax.swing.JTextField txtnumero;
    public static javax.swing.JTextField txtproprietario;
    // End of variables declaration//GEN-END:variables
}
