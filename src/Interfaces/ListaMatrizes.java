package Interfaces;
import DAO.FilhotesDAO;
import DAO.MatrizesDAO;
import static Interfaces.ConsultaMatriz.tabelaFilhotes;
import static Interfaces.ConsultaMatriz.txtcodigo;
import JavaBeans.Filhotes;
import JavaBeans.Matrizes;
import Utilitários.Listar;
import java.awt.Dimension;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ListaMatrizes extends javax.swing.JInternalFrame {
    public ListaMatrizes() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoeditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMatrizes = new javax.swing.JTable();
        botaoexcluir = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        botaobuscar = new javax.swing.JButton();
        botaoconsulta = new javax.swing.JButton();
        botaoatualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Lista de Matrizes");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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
            }
        });

        botaoeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BTNeditar.png"))); // NOI18N
        botaoeditar.setToolTipText("Editar Matriz");
        botaoeditar.setBorderPainted(false);
        botaoeditar.setMaximumSize(new java.awt.Dimension(24, 24));
        botaoeditar.setMinimumSize(new java.awt.Dimension(24, 24));
        botaoeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoeditarActionPerformed(evt);
            }
        });

        tabelaMatrizes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nome", "Proprietário", "Situção"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaMatrizes.setMaximumSize(new java.awt.Dimension(10, 0));
        jScrollPane1.setViewportView(tabelaMatrizes);
        if (tabelaMatrizes.getColumnModel().getColumnCount() > 0) {
            tabelaMatrizes.getColumnModel().getColumn(0).setResizable(false);
            tabelaMatrizes.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaMatrizes.getColumnModel().getColumn(1).setResizable(false);
            tabelaMatrizes.getColumnModel().getColumn(1).setPreferredWidth(30);
            tabelaMatrizes.getColumnModel().getColumn(2).setPreferredWidth(45);
            tabelaMatrizes.getColumnModel().getColumn(3).setResizable(false);
            tabelaMatrizes.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        botaoexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imageres_98.ico_24x24.png"))); // NOI18N
        botaoexcluir.setToolTipText("Excluir Matriz");
        botaoexcluir.setBorder(null);
        botaoexcluir.setBorderPainted(false);
        botaoexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoexcluirActionPerformed(evt);
            }
        });

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        botaobuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imageres_5332.ico_24x24.png"))); // NOI18N
        botaobuscar.setMaximumSize(new java.awt.Dimension(24, 24));
        botaobuscar.setMinimumSize(new java.awt.Dimension(24, 24));
        botaobuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaobuscarActionPerformed(evt);
            }
        });

        botaoconsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imageres_8.ico_24x24.png"))); // NOI18N
        botaoconsulta.setToolTipText("Consulta");
        botaoconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoconsultaActionPerformed(evt);
            }
        });

        botaoatualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh_arrow_1546.png_24x24.png"))); // NOI18N
        botaoatualizar.setMaximumSize(new java.awt.Dimension(24, 24));
        botaoatualizar.setMinimumSize(new java.awt.Dimension(24, 24));
        botaoatualizar.setPreferredSize(new java.awt.Dimension(24, 24));
        botaoatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoatualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(botaoconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botaobuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setBounds(0, 0, 546, 392);
    }// </editor-fold>//GEN-END:initComponents
    public void setPosicao() {

        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        Listar lis = new Listar();
        lis.ListarNomes();
    }//GEN-LAST:event_formInternalFrameActivated
    private void botaoeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoeditarActionPerformed
        if (tabelaMatrizes.getSelectedRow() != -1) {
            EditarMatriz obj = new EditarMatriz();
            Principal.getPainel().add(obj);
            MatrizesDAO dao = new MatrizesDAO();
            obj.setVisible(true);
            obj.setPosicao();

            Matrizes matrizes = new Matrizes();

            matrizes.setNome((String) tabelaMatrizes.getValueAt(tabelaMatrizes.getSelectedRow(), 1));

            EditarMatriz.txtcodigo.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getIdmatriz().toString());
            EditarMatriz.txtnome.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getNome());
            EditarMatriz.txtnumero.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getNumero());
            EditarMatriz.cmbcaracteristicas.setSelectedItem(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getCaracteristicas());
            EditarMatriz.txtdatanascimento.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getDatanascimento());
            EditarMatriz.txtproprietario.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getProprietario());
            EditarMatriz.txtnomepai.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getNomepai());
            EditarMatriz.txtnomemae.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getNomemae());
            EditarMatriz.cmbsituacao.setSelectedItem(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getSituacao());
        }


    }//GEN-LAST:event_botaoeditarActionPerformed
    private void botaoexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoexcluirActionPerformed
        //criar um objeto do tipo matrizesDAO
        MatrizesDAO dao = new MatrizesDAO();

        if (tabelaMatrizes.getSelectedRow() != -1) {
            int resposta = JOptionPane.showConfirmDialog(this.rootPane, "Deseja realmente excluir?", title, JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                //Usuário clicou em Sim. Executar o código correspondente.
                //guardar os dados da tela
                Matrizes obj = new Matrizes();
                obj.setIdmatriz(dao.ListarMatrizes().get(tabelaMatrizes.getSelectedRow()).getIdmatriz());

                dao.excluirMatriz(obj);

                JOptionPane.showMessageDialog(this.rootPane, "Matriz excluida com sucesso!");
                Listar lis = new Listar();
                lis.ListarNomes();
            } else if (resposta == JOptionPane.NO_OPTION) {
                //Usuário clicou em não. Executar o código correspondente.     

            }
        }
    }//GEN-LAST:event_botaoexcluirActionPerformed
    private void botaobuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaobuscarActionPerformed
//Botão Listar por nome

        if (txtbuscar.getText().isEmpty()) {
            Listar lis = new Listar();
            lis.ListarNomes();
        } else {
            try {
                //1 passo - Executar o select
                String nome = txtbuscar.getText();
                String numero = txtbuscar.getText();

                MatrizesDAO dao = new MatrizesDAO();

                    List<Matrizes> listadematrizes1 = dao.ListarMatrizesPorNome(nome);
                    List<Matrizes> listadematrizes2 = dao.ListarMatrizesPorNumero(numero);

                    //2 passo - colocar os dados na tabela JTABLE
                    DefaultTableModel modelo = (DefaultTableModel) tabelaMatrizes.getModel();
                    modelo.setNumRows(0);
                    for (Matrizes m : listadematrizes1) {
                        modelo.addRow(new Object[]{
                            // m.getIdmatriz(),
                            m.getNumero(),
                            m.getNome(),
                            //m.getCaracteristicas(),
                            // m.getDatanascimento(),
                            m.getProprietario(),
                            // m.getNomepai(),
                            // m.getNomemae(),
                            m.getSituacao()
                        });
                    }
               
                for (Matrizes m : listadematrizes2) {
                    modelo.addRow(new Object[]{
                        // m.getIdmatriz(),
                        m.getNumero(),
                        m.getNome(),
                        // m.getCaracteristicas(),
                        // m.getDatanascimento(),
                        m.getProprietario(),
                        // m.getNomepai(),
                        // m.getNomemae(),
                        m.getSituacao()
                    });
                }
                
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_botaobuscarActionPerformed
    private void botaoconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoconsultaActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        if (tabelaMatrizes.getSelectedRow() != -1) {
            ConsultaMatriz obj = new ConsultaMatriz();
            MatrizesDAO dao = new MatrizesDAO();
            FilhotesDAO daof = new FilhotesDAO();
            Principal.getPainel().add(obj);
            obj.setVisible(true);
            obj.setPosicao();

            Matrizes matrizes = new Matrizes();

            matrizes.setNome((String) tabelaMatrizes.getValueAt(tabelaMatrizes.getSelectedRow(), 1));

            ConsultaMatriz.txtcodigo.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getIdmatriz().toString());
            ConsultaMatriz.txtnome.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getNome());
            ConsultaMatriz.txtnumero.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getNumero());
            ConsultaMatriz.txtcaracteristica.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getCaracteristicas());
            ConsultaMatriz.txtdatanascimento.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getDatanascimento());
            ConsultaMatriz.txtproprietario.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getProprietario());
            ConsultaMatriz.txtnomepai.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getNomepai());
            ConsultaMatriz.txtnomemae.setText(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getNomemae());
            ConsultaMatriz.cmbsituacao.setSelectedItem(dao.ListarMatrizesPorNome(matrizes.getNome()).get(0).getSituacao());

            List<Filhotes> listaFilhotes = daof.pesquisaMae(Integer.parseInt(txtcodigo.getText()));
            DefaultTableModel modelo = (DefaultTableModel) tabelaFilhotes.getModel();
            modelo.setNumRows(0);
            for (Filhotes f : listaFilhotes) {
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

    }//GEN-LAST:event_botaoconsultaActionPerformed
    private void botaoatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoatualizarActionPerformed
        Listar lis = new Listar();
        lis.ListarNomes();
    }//GEN-LAST:event_botaoatualizarActionPerformed
    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        botaobuscarActionPerformed(evt);
    }//GEN-LAST:event_txtbuscarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoatualizar;
    private javax.swing.JButton botaobuscar;
    private javax.swing.JButton botaoconsulta;
    private javax.swing.JButton botaoeditar;
    private javax.swing.JButton botaoexcluir;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabelaMatrizes;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
