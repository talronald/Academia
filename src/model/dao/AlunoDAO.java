package model.dao;

import model.bean.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

public class AlunoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Aluno> lista = new ArrayList<>();

    public void cadastrarAluno(Aluno objaluno) {
        String sql = "insert into aluno (id_aluno, nome_aluno, CPF, endereco, telefone, idade) values (?, ?, ?, ?, ?, ?)";

        conn = new ConexaDAO().conectaDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objaluno.getId_Aluno());
            pstm.setString(2, objaluno.getNome_Aluno());
            pstm.setString(3, objaluno.getCPF_Aluno());
            pstm.setString(4, objaluno.getEndereco_Aluno());
            pstm.setString(5, objaluno.getTelefone_Aluno());
            pstm.setString(6, objaluno.getIdade_Aluno());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O erro está na classe AlunoDAO - Cadastrar" + erro);
        }

    }

    public ArrayList<Aluno> PesquisarAluno() {

        String sql = "select * from aluno";
        conn = new ConexaDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Aluno objaluno = new Aluno();
                objaluno.setId_Aluno(rs.getInt("id_Aluno"));
                objaluno.setNome_Aluno(rs.getString("nome_aluno"));
                objaluno.setCPF_Aluno(rs.getString("CPF"));
                objaluno.setEndereco_Aluno(rs.getString("endereco"));
                objaluno.setTelefone_Aluno(rs.getString("telefone"));
                objaluno.setIdade_Aluno(rs.getString("idade"));

                lista.add(objaluno);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "O erro está na classe AlunoDAO - Pesquisar" + erro);
        }

        return lista;

    }

}
