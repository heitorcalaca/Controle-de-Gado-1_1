package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection conecta;

    public ConnectionFactory() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conecta = DriverManager.getConnection("jdbc:derby:C:\\Users\\heito\\Desktop\\Pasta nova\\controledegado", "root", "root");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
