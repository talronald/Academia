/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import com.mysql.cj.protocol.Resultset;
import model.bean.Aluno;
import model.dao.AlunoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author Ronald
 */
public class frmCadastroAluno extends javax.swing.JFrame {

    /**
     * Creates new form frmCadastroAluno
     */
    public frmCadastroAluno() {
        initComponents();
        listarDados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        NOME = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAluno = new javax.swing.JTable();
        btnCarregar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("  CADASTRO ALUNO");

        NOME.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        NOME.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("CPF");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Endereço");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Telefone");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Idade");

        btnCadastrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCadastrar.setText("  CADASTRAR  ");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código ID", "Nome", "CPF", "Endereço", "Telefone", "Idade"
            }
        ));
        jScrollPane1.setViewportView(tabelaAluno);

        btnCarregar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCarregar.setText(" CARREGAR DADOS ");
        btnCarregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnCarregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAlterar.setText("  ALTERAR  ");
        btnAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("ID");

        txtCodigo.setEnabled(false);

        btnExcluir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnExcluir.setText("  EXCLUIR  ");
        btnExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("  Voltar");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(NOME))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtEndereco))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCadastrar))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOME))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrar();
        listarDados();
        LimparCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        CarregarDados();
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarDados();
        listarDados();
        LimparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Excluir();
        listarDados();
        LimparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NOME;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAluno;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void cadastrar() {

        String nome, CPF, endereco, idade, telefone;
        int codPlano;

        nome = txtNome.getText();
        CPF = txtCPF.getText();
        endereco = txtEndereco.getText();
        telefone = txtTelefone.getText();
        idade = txtIdade.getText();

        Aluno objaluno = new Aluno();
        objaluno.setNome_Aluno(nome);
        objaluno.setCPF_Aluno(CPF);
        objaluno.setEndereco_Aluno(endereco);
        objaluno.setIdade_Aluno(idade);
        objaluno.setTelefone_Aluno(telefone);

        AlunoDAO objalunodao = new AlunoDAO();
        objalunodao.cadastrarAluno(objaluno);
    }

    private void listarDados() {
        try {
            AlunoDAO objalunodao = new AlunoDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaAluno.getModel();
            model.setNumRows(0);

            ArrayList<Aluno> lista = objalunodao.PesquisarAluno();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_Aluno(),
                    lista.get(num).getNome_Aluno(),
                    lista.get(num).getCPF_Aluno(),
                    lista.get(num).getEndereco_Aluno(),
                    lista.get(num).getTelefone_Aluno(),
                    lista.get(num).getIdade_Aluno()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "O erro está no método listarDados - Aluno" + erro);
        }
    }

    private void CarregarDados() {

        int setar = tabelaAluno.getSelectedRow();

        txtCodigo.setText(tabelaAluno.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaAluno.getModel().getValueAt(setar, 1).toString());
        txtCPF.setText(tabelaAluno.getModel().getValueAt(setar, 2).toString());
        txtEndereco.setText(tabelaAluno.getModel().getValueAt(setar, 3).toString());
        txtTelefone.setText(tabelaAluno.getModel().getValueAt(setar, 4).toString());
        txtIdade.setText(tabelaAluno.getModel().getValueAt(setar, 5).toString());

    }

    private void LimparCampos() {

        txtNome.setText("");
        txtCPF.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtIdade.setText("");
        txtNome.requestFocus();
    }

    private void AlterarDados() {
        int id_aluno;
        String nome, CPF, Endereco, Telefone, Idade;

        id_aluno = Integer.parseInt(txtCodigo.getText());
        nome = txtNome.getText();
        CPF = txtCPF.getText();
        Endereco = txtEndereco.getText();
        Telefone = txtTelefone.getText();
        Idade = txtTelefone.getText();

        Aluno objaluno = new Aluno();
        objaluno.setId_Aluno(id_aluno);
        objaluno.setNome_Aluno(nome);
        objaluno.setCPF_Aluno(CPF);
        objaluno.setEndereco_Aluno(Endereco);
        objaluno.setTelefone_Aluno(Telefone);
        objaluno.setIdade_Aluno(Idade);

        AlunoDAO objalunodao = new AlunoDAO();
        objalunodao.AlterarAluno(objaluno);
    }

    private void Excluir() {

        int id_aluno;

        id_aluno = Integer.parseInt(txtCodigo.getText());

        Aluno objaluno = new Aluno();
        objaluno.setId_Aluno(id_aluno);

        AlunoDAO objalunodao = new AlunoDAO();
        objalunodao.ExcluirAluno(objaluno);

    }

}
