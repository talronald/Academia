
package model.dao;

import model.bean.Visitante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class VisitanteDAO {
    
    Connection conn;
    PreparedStatement pstm;

    public void cadastrarVisitante(Visitante objvisitante) {
        String sql = "insert into visitante (nome_visitante, CPF_visitante, telefone_visitante) values (?, ?, ?)";

        conn = new ConexaDAO().conectaDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objvisitante.getNome_Visitante());
            pstm.setString(2, objvisitante.getCPF_Visitante());
            pstm.setString(3, objvisitante.getTelefone_Visitante());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O erro está na classe VisitanteDAO" + erro);
        }
    
    }
    
}
