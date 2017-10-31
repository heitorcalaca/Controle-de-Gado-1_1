/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.CaracteristicasDAO;
import DAO.MatrizesDAO;
import JavaBeans.Caracteristicas;
import JavaBeans.Matrizes;
import Utilitários.Listar;
import java.awt.Component;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author heito
 */
public class NovaMatrizDesmamada extends javax.swing.JInternalFrame {

    /**
     * Creates new form NovaMatriz
     */
    public NovaMatrizDesmamada() {
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

        txtnome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnomemae = new javax.swing.JTextField();
        txtdatanascimento = new javax.swing.JFormattedTextField();
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
        jLabel9 = new javax.swing.JLabel();
        txtdatadesmama = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Nova Matriz Desmamada");
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

        try {
            MaskFormatter mascara = new MaskFormatter("##/##/####");
            mascara.setPlaceholderCharacter('_');
            txtdatanascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Proprietário");

        jLabel6.setText("Nome do Pai");

        jLabel1.setText("Nome");

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

        jLabel9.setText("Data de Desmama");

        try {
            MaskFormatter mascara = new MaskFormatter("##/##/####");
            mascara.setPlaceholderCharacter('_');
            txtdatadesmama.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));
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
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtnomemae, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtproprietario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbcaracteristicas, 0, 310, Short.MAX_VALUE)
                            .addComponent(txtnomepai))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtdatanascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(txtnumero, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbsituação, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtdatadesmama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnumero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdatanascimento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(cmbcaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdatadesmama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbsituação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtproprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtnomepai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtnomemae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        MatrizesDAO dao = new MatrizesDAO();
        String nome = txtnome.getText();
        String numero = txtnumero.getText();
        if (txtnome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.rootPane, "O campo Nome é obrigatório");
            txtnome.grabFocus();
        } else if (dao.verificarNome(nome) == true) {
            JOptionPane.showMessageDialog(this.rootPane, "O nome '" + txtnome.getText() + "' já está cadastrado");
            txtnome.grabFocus();
            txtnome.setText("");
        } else if (txtnumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.rootPane, "O campo Numero é obrigatório");
            txtnumero.grabFocus();
        } else if (txtnumero.getText().length() < 3) {
            JOptionPane.showMessageDialog(this.rootPane, "Insira um número com 3 ou mais dígitos");
            txtnumero.grabFocus();
        } else if (dao.verificarNumero(numero) == true) {
            JOptionPane.showMessageDialog(this.rootPane, "O numero '" + txtnumero.getText() + "' já está cadastrado");
            txtnumero.grabFocus();
            txtnumero.setText("");
        } else if (txtproprietario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.rootPane, "O campo Proprietário é obrigatório");
            txtproprietario.grabFocus();
        }else {
            try {
                //botão salvar

                //1 passo - guardar os dados da tela no obj matrizes
                Matrizes obj = new Matrizes();
                obj.setNumero(txtnumero.getText());
                obj.setNome(txtnome.getText());
                obj.setCaracteristicas((String) cmbcaracteristicas.getSelectedItem().toString());
                obj.setDatanascimento(txtdatanascimento.getText());
                obj.setProprietario(txtproprietario.getText());
                obj.setNomepai(txtnomepai.getText());
                obj.setNomemae(txtnomemae.getText());
                obj.setSituacao((String) cmbsituação.getSelectedItem());

                //2 pass0 - criar objeto do tipo matrizesDAO
                dao.cadastrarMatriz(obj);

                JOptionPane.showMessageDialog(this.rootPane, "Cadastro Realizado com Sucesso!");
            } catch (Exception erro) {
                System.out.println(erro);
                JOptionPane.showMessageDialog(this.rootPane, "Erro" + erro);

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

        Listar lis = new Listar();
        lis.ListarNomes();
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
                cmbcaracteristicas.addItem(c);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_formInternalFrameOpened


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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txtdatadesmama;
    public static javax.swing.JFormattedTextField txtdatanascimento;
    public static javax.swing.JTextField txtnome;
    public static javax.swing.JTextField txtnomemae;
    public static javax.swing.JTextField txtnomepai;
    public static javax.swing.JTextField txtnumero;
    public static javax.swing.JTextField txtproprietario;
    // End of variables declaration//GEN-END:variables
}
