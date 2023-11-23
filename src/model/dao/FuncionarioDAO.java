
package model.dao;

import model.bean.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    
    Connection conn;
    PreparedStatement pstm;

    public void cadastrarFuncionario(Funcionario objfuncionario) {
        String sql = "insert into funcionario (Nome_Funcionario, CPF_Funcionario, Endereco_Funcionario, Telefone_Funcionario, Funcao_Funcionario) values (?, ?, ?, ?, ?)";

        conn = new ConexaDAO().conectaDB();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionario.getNome_Funcionario());
            pstm.setString(2, objfuncionario.getCPF_Funcionario());
            pstm.setString(3, objfuncionario.getTelefone_Funcionario());
            pstm.setString(4, objfuncionario.getEndereco_Funcionario());
            pstm.setString(5, objfuncionario.getFuncao_Funcionario());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O erro está na classe FuncionarioDAO" + erro);
        }
    
    }
    
}
