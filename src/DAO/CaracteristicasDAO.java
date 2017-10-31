package DAO;

import JDBC.ConnectionFactory;
import JavaBeans.Caracteristicas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CaracteristicasDAO {
    private Connection conecta;
    
    //construtor
    public CaracteristicasDAO(){
        this.conecta = new ConnectionFactory().conecta;
    }
    
    //Metodo Cadastrar Características
    public void cadastrarCaracteristicas(Caracteristicas obj){
        try{
            //comando sql
            String cmdsql = "insert into caracteristicas (caracteristicas) values(?)";
            
            //organizar cmdsql e executar
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            
            stmt.setString(1, obj.getCaracteristicas());
            
            //executar comando
            stmt.execute();
            
            //fechar conexão
            stmt.close();            
           
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public List<Caracteristicas> ListarCaracteristicas() {
        try {
            //1 passo - criar o vetor que vai armazenar os registros do banco
            List<Caracteristicas> lista = new ArrayList<Caracteristicas>();

            //2 passo - criar o comando sql
            String cmdSql = "select * from caracteristicas order by caracteristicas";
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);

            //3 passo - Guarda o resultado do select dentro do objeto RS (resultSet)
            ResultSet rs = stmt.executeQuery();

            //4 passo - Enquanto houver registros (resultado do select) guarde o registro na lista
            while (rs.next()) {
                Caracteristicas c = new Caracteristicas();
                c.setIdcaracteristica(rs.getInt("idcaracteristica"));
                c.setCaracteristicas(rs.getString("caracteristicas"));
                lista.add(c);
            }
            return lista;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public void alterarCaracterísitca(Caracteristicas obj){
        try {
            // comando SQL
        String cmdsql = "UPDATE caracteristicas SET caracteristicas=? WHERE idcaracteristica=?";
        
        PreparedStatement stmt = conecta.prepareStatement(cmdsql);
        
        stmt.setString(1, obj.getCaracteristicas());
        stmt.setInt(2, obj.getIdcaracteristica());
        
        stmt.execute();
        
        stmt.close();
        
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        
    }
    
    public void excluirCaracterística(Caracteristicas obj){
        try{
            String cmdsql = "delete from caracteristicas where idcaracteristica=?";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            
            stmt.setInt(1, obj.getIdcaracteristica());
            
            stmt.execute();
            
            stmt.close();
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
        
    }
}
