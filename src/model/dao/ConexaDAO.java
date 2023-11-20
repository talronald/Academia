package model.dao;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaDAO {
    
    public Connection conectaDB(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/bancoacad?user=root&password=";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados"+erro.getMessage());
        }
        return conn;
    }
    
}
