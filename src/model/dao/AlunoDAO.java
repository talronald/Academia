package model.dao;

import model.bean.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class AlunoDAO {

    Connection conn;
    PreparedStatement pstm;

    public void cadastrarAluno(Aluno objaluno) {
        String sql = "insert into aluno (nome_aluno, CPF, endereco, telefone, idade) values (?, ?, ?, ?, ?)";

        conn = new ConexaDAO().conectaDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objaluno.getNome_Aluno());
            pstm.setString(2, objaluno.getCPF_Aluno());
            pstm.setString(3, objaluno.getEndereco_Aluno());
            pstm.setString(4, objaluno.getTelefone_Aluno());
            pstm.setString(5, objaluno.getIdade_Aluno());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O erro está na classe AlunoDAO" + erro);
        }

    }

}
