/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.FilhotesDAO;
import DAO.MatrizesDAO;
import static Interfaces.ConsultaMatriz.tabelaFilhotes;
import static Interfaces.ConsultaMatriz.txtcodigo;
import static Interfaces.NovoFilhote.txtnome;
import static Interfaces.NovoFilhote.txtnumero;
import JavaBeans.Filhotes;
import JavaBeans.Matrizes;
import java.awt.Dimension;
import Utilitários.Listar;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author heito
 */
public class BaixaFilhote extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaMatriz1
     */
    public BaixaFilhote() {
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
        btnDesmama = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaFilhotes = new javax.swing.JTable();
        txtsituacao = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Baixa de Filhote");

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

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        txtobservação.setColumns(20);
        txtobservação.setRows(5);
        txtobservação.setFocusable(false);
        jScrollPane1.setViewportView(txtobservação);

        jLabel5.setText("Proprietário");

        jLabel2.setText("Número");

        jLabel1.setText("Nome");

        jLabel10.setText("Observação");

        jLabel3.setText("Características");

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

        btnDesmama.setText("Desmamar");
        btnDesmama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesmamaActionPerformed(evt);
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

        txtsituacao.setFocusable(false);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BTNeditar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addGap(75, 75, 75)
                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(19, 19, 19)
                .addComponent(txtcaracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(txtdatanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addComponent(txtproprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel8)
                .addGap(70, 70, 70)
                .addComponent(txtsituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
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
                .addGap(313, 313, 313)
                .addComponent(jLabel11))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel9)
                .addGap(346, 346, 346)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnDesmama, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcaracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdatanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtproprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtnomepai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtnomemae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(btnDesmama)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }


    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
        int aux = 0;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        FilhotesDAO daof = new FilhotesDAO();
        if (txtnome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.rootPane, "Insira o nome da matriz");
            txtnome.grabFocus();
        }

        try {

            String nome = txtnome.getText();
            MatrizesDAO dao = new MatrizesDAO();

            List<Matrizes> lista = dao.nomeMae(nome);

            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(this.rootPane, "Matriz não cadastrada");
                txtnome.grabFocus();
                //limpar tela
                for (int i = 0; i < getContentPane().getComponentCount(); i++) {
                    Component c = getContentPane().getComponent(i);
                    if (c instanceof JTextField) {
                        JTextField field = (JTextField) c;
                        field.setText("");
                    }
                }
            }

            for (Matrizes mae : lista) {

                txtnumero.setText(mae.getNumero());
                txtcaracteristica.setText(mae.getCaracteristicas());
                txtdatanascimento.setText(mae.getDatanascimento());
                txtproprietario.setText(mae.getProprietario());
                txtsituacao.setText(mae.getSituacao());
                txtnomepai.setText(mae.getNomepai());
                txtnomemae.setText(mae.getNomemae());
                txtcodigo.setText(Integer.toString(mae.getIdmatriz()));
            }

            List<Filhotes> listaFilhotes = daof.pesquisaMae(Integer.parseInt(txtcodigo.getText()));
            DefaultTableModel modelo = (DefaultTableModel) tabelaFilhotes.getModel();
            modelo.setNumRows(0);

            for (int i = 0; i < listaFilhotes.size(); i++) {
                String situacao = listaFilhotes.get(i).getSituacao();
                if (situacao.contains("NO")) {
                    aux++;
                }
            }

            if (aux == 0) {
                JOptionPane.showMessageDialog(this.rootPane, "Não existe filhote em fase de desmama!");
                txtnome.grabFocus();
                //limpar tela
                for (int i = 0; i < getContentPane().getComponentCount(); i++) {
                    Component c = getContentPane().getComponent(i);
                    if (c instanceof JTextField) {
                        JTextField field = (JTextField) c;
                        field.setText("");
                    }
                }

            } else {
                for (Filhotes f : listaFilhotes) {
                    if (f.getSituacao().equals("NO")) {
                        modelo.addRow(new Object[]{
                            formato.format(f.getDatanascimento()),
                            f.getSexo(),
                            f.getNomepai(),
                            formato.format(f.getDatadesmama()),
                            f.getNumerofilhote(),
                            f.getSituacao(),
                            f.getObservacao()
                        });
                    }
                }

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_txtnomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Listar lis = new Listar();
        lis.ListarNomes();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDesmamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesmamaActionPerformed
        // TODO add your handling code here:
        try {
            FilhotesDAO daof = new FilhotesDAO();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            Filhotes f = new Filhotes();

            String idMatriz = txtcodigo.getText();

            if (tabelaFilhotes.getValueAt(tabelaFilhotes.getSelectedRow(), 1).equals("F")) {

                NovaMatrizDesmamada obj = new NovaMatrizDesmamada();
                Principal.getPainel().add(obj);
                obj.setVisible(true);
                obj.setPosicao();

                for (int i = 0; i < daof.pesquisaFilhote(idMatriz).size(); i++) {
                    if (daof.pesquisaFilhote(idMatriz).get(i).getSituacao().equals("NO")) {
                        f.setDatanascimento(daof.pesquisaFilhote(idMatriz).get(i).getDatanascimento());
                        f.setProprietario(daof.pesquisaFilhote(idMatriz).get(i).getProprietario());
                        f.setNomepai(daof.pesquisaFilhote(idMatriz).get(i).getNomepai());
                        f.setCaracteristicas(daof.pesquisaFilhote(idMatriz).get(i).getCaracteristicas());

                        NovaMatrizDesmamada.txtdatanascimento.setText(formato.format(f.getDatanascimento()));
                        NovaMatrizDesmamada.txtproprietario.setText(f.getProprietario());
                        NovaMatrizDesmamada.cmbcaracteristicas.setSelectedItem(f.getCaracteristicas());
                        NovaMatrizDesmamada.txtnomepai.setText(f.getNomepai());
                        NovaMatrizDesmamada.txtnomemae.setText(txtnome.getText());
                        break;
                    }
                }
            } else {

                NovoMachoDesmamado obj = new NovoMachoDesmamado();
                Principal.getPainel().add(obj);
                obj.setVisible(true);
                obj.setPosicao();

                for (int i = 0; i < daof.pesquisaFilhote(idMatriz).size(); i++) {
                    if (daof.pesquisaFilhote(idMatriz).get(i).getSituacao().equals("NO")) {

                        System.out.println(daof.pesquisaFilhote(idMatriz).get(i).getDatanascimento());

                        f.setDatanascimento(daof.pesquisaFilhote(idMatriz).get(i).getDatanascimento());
                        f.setProprietario(daof.pesquisaFilhote(idMatriz).get(i).getProprietario());
                        f.setNomepai(daof.pesquisaFilhote(idMatriz).get(i).getNomepai());
                        f.setCaracteristicas(daof.pesquisaFilhote(idMatriz).get(i).getCaracteristicas());

                        NovoMachoDesmamado.txtdatanascimento.setText(formato.format(f.getDatanascimento()));
                        NovoMachoDesmamado.txtproprietario.setText(f.getProprietario());
                        NovoMachoDesmamado.cmbcaracteristicas.setSelectedItem(f.getCaracteristicas());
                        NovoMachoDesmamado.txtnomepai.setText(f.getNomepai());
                        NovoMachoDesmamado.txtnomemae.setText(txtnome.getText());
                        NovoMachoDesmamado.txtnumeromae.setText(txtnumero.getText());
                        break;
                    }

                }

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnDesmamaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    public int idFilhoteF() {
        try {
            FilhotesDAO daof = new FilhotesDAO();

            String nomeMatriz = NovaMatrizDesmamada.txtnomemae.getText();
            int idFilhote = daof.pesquisaFilhoteM(nomeMatriz).get(0).getIdfilhote();

            return idFilhote;
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }

    }

    public int idFilhoteM() {
        try {
            FilhotesDAO daof = new FilhotesDAO();

            String nomeMatriz = NovoMachoDesmamado.txtnomemae.getText();
            int idFilhote = daof.pesquisaFilhoteM(nomeMatriz).get(0).getIdfilhote();

            return idFilhote;
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesmama;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JTextField txtsituacao;
    // End of variables declaration//GEN-END:variables
}
