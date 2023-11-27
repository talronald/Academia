package model.dao;

import model.bean.Instrutor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

public class InstrutorDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Instrutor> lista = new ArrayList<>();

    public void cadastrarInstrutor(Instrutor objinstrutor) {
        String sql = "insert into instrutor (id_instrutor, nome_instrustor, CPF_instrutor, telefone_instrutor, endereco_instrutor) values (?, ?, ?, ?, ?)";

        conn = new ConexaDAO().conectaDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objinstrutor.getId_Instrutor());
            pstm.setString(2, objinstrutor.getNome_Instrutor());
            pstm.setString(3, objinstrutor.getCPF_Instrutor());
            pstm.setString(4, objinstrutor.getTelefone_Instrutor());
            pstm.setString(5, objinstrutor.getEndereco_Instrutor());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O erro está na classe InstrutorDAO" + erro);
        }
    }

    public ArrayList<Instrutor> PesquisarInstrutor() {

        String sql = "select * from instrutor";
        conn = new ConexaDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Instrutor objinstrutor = new Instrutor();
                objinstrutor.setId_Instrutor(rs.getInt("id_instrutor"));
                objinstrutor.setNome_Instrutor(rs.getString("nome_instrustor"));
                objinstrutor.setCPF_Instrutor(rs.getString("CPF_instrutor"));
                objinstrutor.setTelefone_Instrutor(rs.getString("telefone_Instrutor"));
                objinstrutor.setEndereco_Instrutor(rs.getString("endereco_Instrutor"));

                lista.add(objinstrutor);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "O erro está na classe InstrutorDAO - Pesquisar" + erro);
        }

        return lista;

    }

    public void AlterarInstrutor(Instrutor objinstrutor) {
        String sql = "update instrutor set nome_instrustor = ?, CPF_instrutor = ?, telefone_instrutor = ? , endereco_instrutor = ? where id_Instrutor = ?";

        conn = new ConexaDAO().conectaDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objinstrutor.getNome_Instrutor());
            pstm.setString(2, objinstrutor.getCPF_Instrutor());
            pstm.setString(3, objinstrutor.getTelefone_Instrutor());
            pstm.setString(4, objinstrutor.getEndereco_Instrutor());
            pstm.setInt(5, objinstrutor.getId_Instrutor());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O erro está na classe InstrutorDAO - Alterar" + erro);
        }
    }

    public void ExcluirInstrutor(Instrutor objinstrutor) {

        String sql = "delete from instrutor where id_Instrutor = ?";

        conn = new ConexaDAO().conectaDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objinstrutor.getId_Instrutor());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O erro está na classe InstrutorDAO - Excluir" + erro);
        }

    }

}
