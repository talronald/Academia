package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import model.bean.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class UsuarioDAO {

    Connection conn;

    public ResultSet autenticarUsu(Usuario objusuario) {
        conn = new ConexaDAO().conectaDB();

        try {

            String sql = "Select * from usuario where nome_usuario = ? and senha_usuario = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objusuario.getNome());
            pstm.setString(2, objusuario.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro na classe UsuarioDAO" + erro);
            return null;
        }
    }

}
