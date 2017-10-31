package Interfaces;

import DAO.CaracteristicasDAO;
import JavaBeans.Caracteristicas;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaCaracteristicas extends javax.swing.JInternalFrame {

    public ListaCaracteristicas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelacaracteristicas = new javax.swing.JTable();
        botaoeditar = new javax.swing.JButton();
        botaoatualizar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Lista de Características");
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

        tabelacaracteristicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Características", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelacaracteristicas);
        if (tabelacaracteristicas.getColumnModel().getColumnCount() > 0) {
            tabelacaracteristicas.getColumnModel().getColumn(0).setResizable(false);
            tabelacaracteristicas.getColumnModel().getColumn(1).setResizable(false);
        }

        botaoeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BTNeditar.png"))); // NOI18N
        botaoeditar.setPreferredSize(new java.awt.Dimension(24, 24));
        botaoeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoeditarActionPerformed(evt);
            }
        });

        botaoatualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh_arrow_1546.png_24x24.png"))); // NOI18N
        botaoatualizar.setPreferredSize(new java.awt.Dimension(24, 24));

        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imageres_98.ico_24x24.png"))); // NOI18N
        botaoExcluir.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botaoExcluir.setPreferredSize(new java.awt.Dimension(24, 24));
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoeditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoeditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 530, 310);
    }// </editor-fold>//GEN-END:initComponents

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); }
    
        public void Listar() {
        try {
            tabelacaracteristicas.removeColumn(tabelacaracteristicas.getColumnModel().getColumn(1));
            //1 passo - Executar o select
            CaracteristicasDAO dao = new CaracteristicasDAO();
            List<Caracteristicas> listadecaracteristicas = dao.ListarCaracteristicas();

            //2 passo - colocar os dados na tabela JTABLE
            DefaultTableModel modelo = (DefaultTableModel) tabelacaracteristicas.getModel();
            modelo.setNumRows(0);

            for (Caracteristicas m : listadecaracteristicas) {
                modelo.addRow(new Object[]{
                   m.getCaracteristicas(),
                   m.getIdcaracteristica()
                });
            }
        } catch (Exception e) {
        }
    }
        
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        Listar();
    }//GEN-LAST:event_formInternalFrameActivated

    private void botaoeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoeditarActionPerformed
       EditarCaracterística obj = new EditarCaracterística();
       Principal.getPainel().add(obj);
       obj.setVisible(true);
       obj.setPosicao();
       
       EditarCaracterística.txtcaracteristica.setText(tabelacaracteristicas.getValueAt(tabelacaracteristicas.getSelectedRow(), 0).toString());
       EditarCaracterística.txtcodigo.setText(tabelacaracteristicas.getModel().getValueAt(tabelacaracteristicas.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_botaoeditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this.rootPane, "Deseja realmente excluir esta matriz?", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION){
        try{Caracteristicas obj = new Caracteristicas();
//        obj.setIdcaracteristica((Integer)tabelacaracteristicas.getValueAt(tabelacaracteristicas.getSelectedRow(), 0));
        obj.setIdcaracteristica((Integer)tabelacaracteristicas.getValueAt(tabelacaracteristicas.getSelectedRow(), 1));
        CaracteristicasDAO dao = new CaracteristicasDAO();
        dao.excluirCaracterística(obj);
        
        JOptionPane.showMessageDialog(this.rootPane, "Caracteristica excluida com sucesso");
        Listar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this.rootPane, e);
        }
        }else if (resposta == JOptionPane.NO_OPTION){
            
        }  
    }//GEN-LAST:event_botaoExcluirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoatualizar;
    private javax.swing.JButton botaoeditar;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabelacaracteristicas;
    // End of variables declaration//GEN-END:variables
}
