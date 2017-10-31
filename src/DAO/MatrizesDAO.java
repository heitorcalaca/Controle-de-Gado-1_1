
package DAO;

import Interfaces.NovaMatriz;
import JDBC.ConnectionFactory;
import JavaBeans.Matrizes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;


//Para resetar auto increment utilize ALTER TABLE table_name ALTER COLUMN auto_increment_column_name RESTART WITH 8



public class MatrizesDAO {

    private Connection conecta;

    //Construtor
    public MatrizesDAO() {
        this.conecta = new ConnectionFactory().conecta;
    }

    //Método cadastrar matriz
    public void cadastrarMatriz(Matrizes obj) {
        try {
            //1 passo - criar o comando sql
            String cmdsql = "INSERT INTO matrizes (numero,nome,caracteristicas,"
                    + "datanascimento,proprietario,nomepai,nomemae,situacao) "
                    + "VALUES(?,?,?,?,?,?,?,?)";

            //2 passp - organizar comdsql e executa-lo
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);

            stmt.setString(1, obj.getNumero());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getCaracteristicas());
            stmt.setString(4, obj.getDatanascimento());
            stmt.setString(5, obj.getProprietario());
            stmt.setString(6, obj.getNomepai());
            stmt.setString(7, obj.getNomemae());
            stmt.setString(8, obj.getSituacao());

            //3 passo - Executar o comando
            stmt.execute();

            //4 passo - Fexar a conexão
            stmt.close();

        } catch (SQLException erro) {
            throw new RuntimeException(erro);

        }
    }

    public List<Matrizes> listarDataNascimento() {
        try {
            //1 passo - criar o vetor que vai armazenar os registros do banco
            List<Matrizes> lista = new ArrayList();

            //2 passo - criar o comando sql
            String cmdSql = "select datanascimento from matrizes";
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);

            //3 passo - Guarda o resultado do select dentro do objeto RS (resultSet)
            ResultSet rs = stmt.executeQuery();

            //4 passo - Enquanto houver registros (resultado do select) guarde o registro na lista
            while (rs.next()) {
                Matrizes m = new Matrizes();
                m.setDatanascimento(rs.getString("datanascimento"));
                lista.add(m);
            }
            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    //Listar todas as matrizes
    public List<Matrizes> ListarMatrizes() {
        try {
            //1 passo - criar o vetor que vai armazenar os registros do banco
            List<Matrizes> lista = new ArrayList();

            //2 passo - criar o comando sql
            String cmdSql = "select * from matrizes order by numero";
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);

            //3 passo - Guarda o resultado do select dentro do objeto RS (resultSet)
            ResultSet rs = stmt.executeQuery();

            //4 passo - Enquanto houver registros (resultado do select) guarde o registro na lista
            while (rs.next()) {
                Matrizes m = new Matrizes();
                m.setIdmatriz(rs.getInt("idmatriz"));
                m.setNumero(rs.getString("numero"));
                m.setNome(rs.getString("nome"));
                m.setCaracteristicas(rs.getString("caracteristicas"));
                m.setDatanascimento(rs.getString("datanascimento"));
                m.setProprietario(rs.getString("proprietario"));
                m.setNomepai(rs.getString("nomepai"));
                m.setNomemae(rs.getString("nomemae"));
                m.setSituacao(rs.getString("situacao"));
                lista.add(m);
            }
            rs.close();
            stmt.close();
            return lista;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    //Listar todas as matrizes por nome
    public List<Matrizes> ListarMatrizesPorNome(String nome) {
        try {
            //1 passo - criar o vetor que vai armazenar os registros do banco
            List<Matrizes> lista = new ArrayList();

            //2 passo - criar o comando sql
            String cmdSql = "SELECT * FROM matrizes WHERE UPPER(nome) LIKE UPPER(?)";
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setString(1, nome);

            //3 passo - Guarda o resultado do select dentro do objeto RS (resultSet)
            ResultSet rs = stmt.executeQuery();

            //4 passo - Enquanto houver registros (resultado do select) guarde o registro na lista
            while (rs.next()) {
                Matrizes m = new Matrizes();
                m.setIdmatriz(rs.getInt("idmatriz"));
                m.setNumero(rs.getString("numero"));
                m.setNome(rs.getString("nome"));
                m.setCaracteristicas(rs.getString("caracteristicas"));
                m.setDatanascimento(rs.getString("datanascimento"));
                m.setProprietario(rs.getString("proprietario"));
                m.setNomepai(rs.getString("nomepai"));
                m.setNomemae(rs.getString("nomemae"));
                m.setSituacao(rs.getString("situacao"));
                lista.add(m);
            }
            return lista;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    //Listar todos as matrizes por numero
    public List<Matrizes> ListarMatrizesPorNumero(String numero) {
        try {
            //1 passo - criar o vetor que vai armazenar os registros do banco
            List<Matrizes> lista = new ArrayList<Matrizes>();

            //2 passo - criar o comando sql
            String cmdSql = "select * from matrizes where numero like ?";
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setString(1, numero);

            //3 passo - Guarda o resultado do select dentro do objeto RS (resultSet)
            ResultSet rs = stmt.executeQuery();

            //4 passo - Enquanto houver registros (resultado do select) guarde o registro na lista
            while (rs.next()) {
                Matrizes m = new Matrizes();
                m.setIdmatriz(rs.getInt("idmatriz"));
                m.setNumero(rs.getString("numero"));
                m.setNome(rs.getString("nome"));
                m.setCaracteristicas(rs.getString("caracteristicas"));
                m.setDatanascimento(rs.getString("datanascimento"));
                m.setProprietario(rs.getString("proprietario"));
                m.setNomepai(rs.getString("nomepai"));
                m.setNomemae(rs.getString("nomemae"));
                m.setSituacao(rs.getString("situacao"));
                lista.add(m);
            }
            stmt.close();
            return lista;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    //Método alterar matriz
    public void alterarMatriz(Matrizes obj) {
        try {
            //1 passo - criar o comando sql
            String cmdsql = "update matrizes SET numero=?, nome=?, caracteristicas=?, datanascimento=?, proprietario=?, nomepai=?, nomemae=?, situacao=? WHERE idmatriz=?";
            //2 passp - organizar comdsql e executa-lo
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);

            stmt.setString(1, obj.getNumero());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getCaracteristicas());
            stmt.setString(4, obj.getDatanascimento());
            stmt.setString(5, obj.getProprietario());
            stmt.setString(6, obj.getNomepai());
            stmt.setString(7, obj.getNomemae());
            stmt.setString(8, obj.getSituacao());
            stmt.setInt(9, obj.getIdmatriz());
            //3 passo - Executar o comando
            stmt.execute();

            //4 passo - Fexar a conexão
            stmt.close();

        } catch (SQLException erro) {
            throw new RuntimeException(erro);

        }
    }

    //Método excluir matriz
    public void excluirMatriz(Matrizes obj) {
        try {
            //1 passo - criar o comando sql
            String cmdsql = "delete from matrizes where idmatriz = ?";

            //2 passp - organizar comdsql e executa-lo
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);

            stmt.setInt(1, obj.getIdmatriz());

            //3 passo - Executar o comando
            stmt.execute();

            //4 passo - Fexar a conexão
            stmt.close();

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    //Método baixar matriz    
    public void baixarMatriz(Matrizes obj) {
        try {
            //1 passo - criar o comando sql
            String cmdsql = "INSERT INTO baixamatriz (numero,nome,caracteristicas,datanascimento,proprietario,nomepai,nomemae,situacao,idmatriz,observacao) VALUES(?,?,?,?,?,?,?,?,?,?)";

            //2 passp - organizar comdsql e executa-lo
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);

            stmt.setString(1, obj.getNumero());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getCaracteristicas());
            stmt.setString(4, obj.getDatanascimento());
            stmt.setString(5, obj.getProprietario());
            stmt.setString(6, obj.getNomepai());
            stmt.setString(7, obj.getNomemae());
            stmt.setString(8, obj.getSituacao());
            stmt.setInt(9, obj.getIdmatriz());
            stmt.setString(10, obj.getObservacao());

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
            List<Matrizes> lista = new ArrayList();

            String cmdSql = "SELECT * FROM matrizes WHERE numero LIKE ?";
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setString(1, numero);

            ResultSet rs = stmt.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Matrizes n = new Matrizes();
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

    public boolean verificarNome(String nome) {
        boolean resultado = false;
        try {
            List<Matrizes> lista = new ArrayList();

            String cmdSql = "SELECT * FROM matrizes WHERE nome LIKE ?";
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Matrizes n = new Matrizes();
                    n.setNome(rs.getString("nome"));
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

    public List<Matrizes> nomeMae(String nome) {
        try {
            //1 passo - criar o vetor que vai armazenar os registros do banco
            List<Matrizes> lista = new ArrayList();

            //2 passo - criar o comando sql
            String cmdSql = "SELECT * FROM matrizes WHERE UPPER(nome) LIKE UPPER(?)";
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            stmt.setString(1, nome);

            //3 passo - Guarda o resultado do select dentro do objeto RS (resultSet)
            ResultSet rs = stmt.executeQuery();

            //4 passo - Enquanto houver registros (resultado do select) guarde o registro na lista             
            while (rs.next()) {
                Matrizes m = new Matrizes();
                m.setIdmatriz(rs.getInt("idmatriz"));
                m.setNumero(rs.getString("numero"));
                m.setNome(rs.getString("nome"));
                m.setCaracteristicas(rs.getString("caracteristicas"));
                m.setDatanascimento(rs.getString("datanascimento"));
                m.setProprietario(rs.getString("proprietario"));
                m.setNomepai(rs.getString("nomepai"));
                m.setNomemae(rs.getString("nomemae"));
                m.setSituacao(rs.getString("situacao"));
                lista.add(m);
            }

            return lista;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
