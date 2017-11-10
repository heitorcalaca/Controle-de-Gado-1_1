/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JavaBeans.Machos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author heito
 */
public class MachosDAO {
    
    private Connection conecta;

    public MachosDAO() {
        this.conecta = new ConnectionFactory().conecta;
    }
        
    public void cadastrarMacho(Machos obj) {
        try {
            //1 passo - criar o comando sql
            String cmdsql = "INSERT INTO machos (numero,lote,caracteristica,"
                    + "datanascimento,proprietario,nomemae,numeromae,situacao) "
                    + "VALUES(?,?,?,?,?,?,?,?)";

            //2 passp - organizar comdsql e executa-lo
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);

            stmt.setString(1, obj.getNumero());
            stmt.setString(2, obj.getLote());
            stmt.setString(3, obj.getCaracteristica());
            stmt.setDate(4, obj.getDatanascimento());
            stmt.setString(5, obj.getProprietario());
            stmt.setString(6, obj.getNomemae());
            stmt.setString(7, obj.getNumeromae());
            stmt.setString(8, obj.getSituacao());

            //3 passo - Executar o comando
            stmt.execute();

            //4 passo - Fexar a conexão
            stmt.close();

        } catch (SQLException erro) {
            throw new RuntimeException(erro);

        }
    }
    
    public void cadastrarMachoNovo(Machos obj) {
        try {
            //1 passo - criar o comando sql
            String cmdsql = "INSERT INTO machos (numero,lote,caracteristica,"
                    + "datanascimento,proprietario,nomemae,situacao) "
                    + "VALUES(?,?,?,?,?,?,?)";

            //2 passp - organizar comdsql e executa-lo
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);

            stmt.setString(1, obj.getNumero());
            stmt.setString(2, obj.getLote());
            stmt.setString(3, obj.getCaracteristica());
            stmt.setDate(4, obj.getDatanascimento());
            stmt.setString(5, obj.getProprietario());
            stmt.setString(6, obj.getNomemae());
            stmt.setString(7, obj.getSituacao());

            //3 passo - Executar o comando
            stmt.execute();

            //4 passo - Fexar a conexão
            stmt.close();

        } catch (SQLException erro) {
            throw new RuntimeException(erro);

        }
    }
    
    public boolean verificarNumero(String numero) {
        boolean resultado = false;
        try {
            List<Machos> lista = new ArrayList();

            String cmdSql = "SELECT * FROM machos WHERE numero=?";
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setString(1, numero);

            ResultSet rs = stmt.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Machos n = new Machos();
                    n.setNumero(rs.getString("numero"));
                    resultado = true;                    
                    lista.add(n);
                }
            }

            rs.close();
            stmt.close();
            return resultado;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
