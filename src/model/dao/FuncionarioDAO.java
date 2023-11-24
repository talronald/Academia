
package model.dao;

import model.bean.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

public class FuncionarioDAO {
    
    Connection conn;
    PreparedStatement pstm;    
    ResultSet rs;
    ArrayList<Funcionario> lista = new ArrayList<>();

    public void cadastrarFuncionario(Funcionario objfuncionario) {
        String sql = "insert into funcionario (Id_Funcionario, Nome_Funcionario, CPF_Funcionario, Endereco_Funcionario, Telefone_Funcionario, Funcao_Funcionario) values (?, ?, ?, ?, ?, ?)";

        conn = new ConexaDAO().conectaDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objfuncionario.getId_Funcionario());
            pstm.setString(2, objfuncionario.getNome_Funcionario());
            pstm.setString(3, objfuncionario.getCPF_Funcionario());
            pstm.setString(4, objfuncionario.getTelefone_Funcionario());
            pstm.setString(5, objfuncionario.getEndereco_Funcionario());
            pstm.setString(6, objfuncionario.getFuncao_Funcionario());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O erro está na classe FuncionarioDAO" + erro);
        }
    
    }
    
    public ArrayList<Funcionario> PesquisarFuncionario() {

        String sql = "select * from funcionario";
        conn = new ConexaDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Funcionario objfuncionario = new Funcionario();
                objfuncionario.setId_Funcionario(rs.getInt("Id_Funcionario"));
                objfuncionario.setNome_Funcionario(rs.getString("Nome_Funcionario"));
                objfuncionario.setCPF_Funcionario(rs.getString("CPF_Funcionario"));
                objfuncionario.setTelefone_Funcionario(rs.getString("Telefone_Funcionario"));
                objfuncionario.setEndereco_Funcionario(rs.getString("Endereco_Funcionario"));
                objfuncionario.setFuncao_Funcionario(rs.getString("Funcao_Funcionario"));

                lista.add(objfuncionario);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "O erro está na classe FuncionarioDAO - Pesquisar" + erro);
        }

        return lista;

    }
    
}
