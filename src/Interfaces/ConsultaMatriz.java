/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.MatrizesDAO;
import JavaBeans.Matrizes;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import static Interfaces.ListaMatrizes.tabelaMatrizes;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Utilitários.Listar;

/**
 *
 * @author heito
 */
public class ConsultaMatriz extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaMatriz1
     */
    public ConsultaMatriz() {
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

        jButton1 = new javax.swing.JButton();
        txtdatanascimento = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        txtnome = new Utilitários.UpperCaseField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtobservação = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbsituacao = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnomepai = new Utilitários.UpperCaseField();
        jLabel8 = new javax.swing.JLabel();
        txtnomemae = new Utilitários.UpperCaseField();
        txtcaracteristica = new Utilitários.UpperCaseField();
        txtproprietario = new Utilitários.UpperCaseField();
        jLabel9 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        botaobaixa = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaFilhotes = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta Matriz");

        txtdatanascimento.setEditable(false);
        try {
            txtdatanascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdatanascimento.setFocusable(false);

        jLabel6.setText("Nome do Pai");

        txtnumero.setEditable(false);
        txtnumero.setFocusable(false);

        txtnome.setEditable(false);
        txtnome.setFocusable(false);

        txtobservação.setColumns(20);
        txtobservação.setRows(5);
        jScrollPane1.setViewportView(txtobservação);

        jLabel5.setText("Proprietário");

        jLabel2.setText("Número");

        jLabel1.setText("Nome");

        jLabel10.setText("Observação");

        jLabel3.setText("Características");

        cmbsituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "VE", "MO", "SU" }));

        jLabel4.setText("Data de Nascimento");

        jLabel7.setText("Nome da Mãe");

        txtnomepai.setEditable(false);
        txtnomepai.setFocusable(false);

        jLabel8.setText("Situação");

        txtnomemae.setEditable(false);
        txtnomemae.setFocusable(false);

        txtcaracteristica.setEditable(false);
        txtcaracteristica.setFocusable(false);

        txtproprietario.setEditable(false);
        txtproprietario.setFocusable(false);

        jLabel9.setText("Código");
        jLabel9.setVisible(false);

        txtcodigo.setEditable(false);
        txtcodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcodigo.setFocusable(false);
        //txtcodigo.setVisible(false);

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        botaobaixa.setText("Baixa");
        botaobaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaobaixaActionPerformed(evt);
            }
        });

        jLabel11.setText("Filhotes");

        tabelaFilhotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dt. Nascimento", "Sexo", "Pai", "Dt. Desmama", "Nr. / Lote", "Situação", "Obs"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelaFilhotes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaobaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(txtnomepai, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtnomemae, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addComponent(jLabel2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtcaracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtproprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addComponent(jLabel8)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtdatanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbsituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcaracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(txtdatanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtproprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8))
                    .addComponent(cmbsituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnomepai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnomemae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jButton2)
                    .addComponent(botaobaixa))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }  
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Listar lis = new Listar();
        lis.ListarNomes();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botaobaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaobaixaActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this.rootPane, "Deseja realmente dar baixa na Matriz?", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION)
        try {
            //1 passo - guardar os dados da tela no obj matrizes
            Matrizes obj = new Matrizes();
            obj.setNumero(txtnumero.getText());
            obj.setNome(txtnome.getText());
            obj.setCaracteristicas(txtcaracteristica.getText());
            obj.setDatanascimento(txtdatanascimento.getText());
            obj.setProprietario(txtproprietario.getText());
            obj.setNomepai(txtnomepai.getText());
            obj.setNomemae(txtnomemae.getText());
            obj.setSituacao((String) cmbsituacao.getSelectedItem());
            obj.setObservacao(txtobservação.getText());
            obj.setIdmatriz(Integer.parseInt(txtcodigo.getText()));

            //2 pass0 - criar objeto do tipo matrizesDAO
            MatrizesDAO dao = new MatrizesDAO();
            dao.baixarMatriz(obj);
            JOptionPane.showMessageDialog(this.rootPane, "Baixa Realizado com Sucesso!");
            dao.excluirMatriz(obj);

        } catch (Exception erro) {
            System.out.println(erro);
            JOptionPane.showMessageDialog(this.rootPane, erro);
        }else if (resposta == JOptionPane.NO_OPTION) {
            //Usuário clicou em não. Executar o código correspondente.
        }
        this.dispose();
        Listar lis = new Listar();
        lis.ListarNomes();
        
    }//GEN-LAST:event_botaobaixaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaobaixa;
    public static javax.swing.JComboBox<String> cmbsituacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable tabelaFilhotes;
    public static javax.swing.JTextField txtcaracteristica;
    public static javax.swing.JTextField txtcodigo;
    public static javax.swing.JFormattedTextField txtdatanascimento;
    public static javax.swing.JTextField txtnome;
    public static javax.swing.JTextField txtnomemae;
    public static javax.swing.JTextField txtnomepai;
    public static javax.swing.JTextField txtnumero;
    private javax.swing.JTextArea txtobservação;
    public static javax.swing.JTextField txtproprietario;
    // End of variables declaration//GEN-END:variables
}