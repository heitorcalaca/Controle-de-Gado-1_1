/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitários;

import DAO.MatrizesDAO;
import static Interfaces.ListaMatrizes.tabelaMatrizes;
import JavaBeans.Matrizes;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author heito
 */
public class Listar {
    
    public void ListarNomes() {
        
        try {
            //1 passo - Executar o select
            MatrizesDAO dao = new MatrizesDAO();
            List<Matrizes> listadematrizes = dao.ListarMatrizes();

            //2 passo - colocar os dados na tabela JTABLE
            DefaultTableModel modelo = (DefaultTableModel) tabelaMatrizes.getModel();
            modelo.setNumRows(0);

            for (Matrizes m : listadematrizes) {
                modelo.addRow(new Object[]{
                    //m.getIdmatriz(),
                    m.getNumero(),
                    m.getNome(),
                    //m.getCaracteristicas(),
                    //m.getDatanascimento(),
                    m.getProprietario(),
                   // m.getNomepai(),
                   // m.getNomemae(),
                    m.getSituacao()
                });
            }
        } catch (Exception e) {
        }
        
    }
    
    public void ListarDatas() {
        
        try {
            //1 passo - Executar o select
            MatrizesDAO dao = new MatrizesDAO();
            List<Matrizes> listadematrizes = dao.ListarMatrizes();

            Matrizes m = new Matrizes();
            System.out.println(m.getDatanascimento());
            
            //2 passo - colocar os dados na tabela JTABLE
//            DefaultTableModel modelo = (DefaultTableModel) tabelaMatrizes.getModel();
//            modelo.setNumRows(0);

//            for (Matrizes m : listadematrizes) {
//                modelo.addRow(new Object[]{
//                    //m.getIdmatriz(),
//                    //m.getNumero(),
//                    //m.getNome(),
//                    //m.getCaracteristicas(),
//                    m.getDatanascimento(),
//                   // m.getProprietario(),
//                   // m.getNomepai(),
//                   // m.getNomemae(),
//                   // m.getSituacao()
//                });
//            }
        } catch (Exception e) {
        }
        
    }
    
    }
