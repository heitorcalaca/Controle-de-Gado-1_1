/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.ConnectionFactory;
import JavaBeans.BaixaMatrizes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author heito
 */
public class BaixaMatrizDAO {
    private Connection conecta;    
//Cnstrutor
    public BaixaMatrizDAO(){
        this.conecta = new ConnectionFactory().conecta;
    }
     //Método Baixar Matriz
     public void baixarMatriz(BaixaMatrizes obj){
        try{
            //comando sql
            String cmdsql = "INSERT INTO baixamatriz (numero,nome,caracteristicas,datanascimento,proprietario,nomepai,nomemae,situacao) VALUES (?,?,?,?,?,?,?,?)";
            
            //organizar cmdsql e executa-lo
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            
            stmt.setString(1, obj.getNumero());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getCaracteristicas());
            stmt.setString(4, obj.getDatanascimento());
            stmt.setString(5, obj.getProprietario());
            stmt.setString(6, obj.getNomepai());
            stmt.setString(7, obj.getNomemae());
            stmt.setString(8, obj.getSituacao());
            
            //executar
            stmt.execute();
            
            //fechar
            stmt.close();
            
        }catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    }
}

   