
package model.dao;

import model.bean.Visitante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

public class VisitanteDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Visitante> lista = new ArrayList<>();

    public void cadastrarVisitante(Visitante objvisitante) {
        String sql = "insert into visitante (Id_Visitante, nome_visitante, CPF_visitante, telefone_visitante) values (?, ?, ?, ?)";

        conn = new ConexaDAO().conectaDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objvisitante.getId_Visitante());
            pstm.setString(2, objvisitante.getNome_Visitante());
            pstm.setString(3, objvisitante.getCPF_Visitante());
            pstm.setString(4, objvisitante.getTelefone_Visitante());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O erro está na classe VisitanteDAO" + erro);
        }
    
    }
    
    public ArrayList<Visitante> PesquisarVisitante() {

        String sql = "select * from visitante";
        conn = new ConexaDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Visitante objvisitante = new Visitante();
                objvisitante.setId_Visitante(rs.getInt("Id_Visitante"));
                objvisitante.setNome_Visitante(rs.getString("Id_Visitante"));
                objvisitante.setCPF_Visitante(rs.getString("CPF_Visitante"));
                objvisitante.setTelefone_Visitante(rs.getString("Telefone_Visitante"));
                

                lista.add(objvisitante);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "O erro está na classe VisitanteDAO - Pesquisar" + erro);
        }

        return lista;

    }
    
}
