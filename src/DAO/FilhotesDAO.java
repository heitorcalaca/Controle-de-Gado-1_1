package DAO;

import JDBC.ConnectionFactory;
import JavaBeans.Filhotes;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilhotesDAO {

    private Connection conecta;

    //Construtor
    public FilhotesDAO() {
        this.conecta = new ConnectionFactory().conecta;
    }

    //Método cadastrar matriz
    public void cadastrarFilhotes(Filhotes obj) {
        try {
            //1 passo - criar o comando sql
            String cmdsql = "INSERT INTO filhotes (numero,nome,caracteristicas,"
                    + "datanascimentomae,proprietario,nomepaimae,nomemaemae,"
                    + "situacao,idmatriz,datanascimento,nomepai,datadesmama,"
                    + "observacao,situacaomae,sexo)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            //2 passp - organizar comdsql e executa-lo
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);

            stmt.setString(1, obj.getNumero());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getCaracteristicas());
            stmt.setString(4, obj.getDatanascimentomae());
            stmt.setString(5, obj.getProprietario());
            stmt.setString(6, obj.getNomepaimae());
            stmt.setString(7, obj.getNomemaemae());
            stmt.setString(8, obj.getSituacao());
            stmt.setInt(9, obj.getIdmatriz());
            stmt.setDate(10, obj.getDatanascimento());
            stmt.setString(11, obj.getNomepai());
            stmt.setDate(12, obj.getDatadesmama());
            stmt.setString(13, obj.getObservacao());
            stmt.setString(14, obj.getSituacaomae());
            stmt.setString(15, obj.getSexo());

            //3 passo - Executar o comando
            stmt.execute();

            //4 passo - Fexar a conexão
            stmt.close();

        } catch (SQLException erro) {
            throw new RuntimeException(erro);

        }

    }

    public void desmamarFilhote(Filhotes obj) {
        try {
            //1 passo - criar o comando sql
            String cmdsql = "UPDATE filhotes SET situacao=?, datadesmama=?, numerofilhote=? WHERE idfilhote=?";
            //2 passp - organizar comdsql e executa-lo
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            
            stmt.setString(1, obj.getSituacao());
            stmt.setDate(2, obj.getDatadesmama());
            stmt.setString(3, obj.getNumerofilhote());
            stmt.setInt(4, obj.getIdfilhote());
            //3 passo - Executar o comando
            stmt.execute();

            //4 passo - Fexar a conexão
            stmt.close();

        } catch (SQLException erro) {
            throw new RuntimeException(erro);

        }
    }

    public List<Filhotes> pesquisaMae(Integer idmatriz) {
        try {
            List<Filhotes> lista = new ArrayList();

            String cmdsql = "SELECT datanascimento, sexo, situacao, nomepai, datadesmama, numerofilhote, observacao FROM filhotes WHERE idmatriz = (?)";

            PreparedStatement stmt = conecta.prepareStatement(cmdsql);

            stmt.setInt(1, idmatriz);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Filhotes f = new Filhotes();
                f.setDatanascimento(rs.getDate("datanascimento"));
                f.setSexo(rs.getString("sexo"));
                f.setNomepai(rs.getString("nomepai"));
                f.setDatadesmama(rs.getDate("datadesmama"));
                f.setNumerofilhote(rs.getString("numerofilhote"));
                f.setSituacao(rs.getString("situacao"));
                f.setObservacao(rs.getString("observacao"));
                lista.add(f);
            }
            rs.close();
            stmt.close();
            return lista;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    

    public List<Filhotes> pesquisaFilhote(String idMatriz) {
        try {
            List<Filhotes> lista = new ArrayList();

            String cmdSql = "SELECT * FROM filhotes WHERE idmatriz=?";
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setString(1, idMatriz);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Filhotes f = new Filhotes();
                f.setIdfilhote(rs.getInt("idfilhote"));
                f.setDatanascimento(rs.getDate("datanascimento"));
                f.setProprietario(rs.getString("proprietario"));
                f.setNomepai(rs.getString("nomepai"));
                f.setCaracteristicas(rs.getString("caracteristicas"));
                f.setSexo(rs.getString("sexo"));
                lista.add(f);
            }
            rs.close();
            stmt.close();
            return lista;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

     public List<Filhotes> pesquisaFilhote(int idFilhote) {
        try {
            List<Filhotes> lista = new ArrayList();

            String cmdSql = "SELECT * FROM filhotes WHERE idfilhote=?";
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setInt(1, idFilhote);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Filhotes f = new Filhotes();
                f.setIdfilhote(rs.getInt("idfilhote"));
                f.setDatanascimento(rs.getDate("datanascimento"));
                f.setProprietario(rs.getString("proprietario"));
                f.setNomepai(rs.getString("nomepai"));
                f.setCaracteristicas(rs.getString("caracteristicas"));
                f.setSexo(rs.getString("sexo"));
                lista.add(f);
            }
            rs.close();
            stmt.close();
            return lista;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

     
    public List<Filhotes> pesquisaFilhoteM(String nomeMae) {
        try {
            List<Filhotes> lista = new ArrayList();

            String cmdSql = "SELECT * FROM filhotes WHERE nome=?";
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setString(1, nomeMae);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                if (rs.getString("situacao").equals("NO")) {
                    Filhotes f = new Filhotes();
                    f.setIdfilhote(rs.getInt("idfilhote"));
                    f.setDatanascimento(rs.getDate("datanascimento"));
                    f.setProprietario(rs.getString("proprietario"));
                    f.setNomepai(rs.getString("nomepai"));
                    f.setCaracteristicas(rs.getString("caracteristicas"));
                    lista.add(f);
                }
            }
            rs.close();
            stmt.close();
            return lista;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Filhotes> pesquisaDesmama() {
        try {
            List<Filhotes> lista = new ArrayList();

            String cmdsql = "SELECT datadesmama, situacao FROM filhotes";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Filhotes f = new Filhotes();
                f.setDatadesmama(rs.getDate("datadesmama"));
                f.setSituacao(rs.getString("situacao"));
                lista.add(f);
            }
            rs.close();
            stmt.close();

            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
