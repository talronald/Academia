package model.dao;

import model.bean.Instrutor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class InstrutorDAO {
    
    Connection conn;
    PreparedStatement pstm;

    public void cadastrarInstrutor(Instrutor objinstrutor) {
        String sql = "insert into instrutor (nome_instrustor, CPF_instrutor, telefone_instrutor, endereco_instrutor) values (?, ?, ?, ?)";

        conn = new ConexaDAO().conectaDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objinstrutor.getNome_Instrutor());
            pstm.setString(2, objinstrutor.getCPF_Instrutor());
            pstm.setString(3, objinstrutor.getTelefone_Instrutor());
            pstm.setString(4, objinstrutor.getEndereco_Instrutor());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O erro está na classe InstrutorDAO" + erro);
        }
    
    }
}
