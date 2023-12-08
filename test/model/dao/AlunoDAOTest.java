/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model.dao;

import java.util.ArrayList;
import model.bean.Aluno;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Edilson
 */
public class AlunoDAOTest {
    
    public AlunoDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of cadastrarAluno method, of class AlunoDAO.
     */
    @Test
public void testCadastrarAluno() {
    System.out.println("cadastrarAluno");

    // Crie um objeto Aluno com dados válidos
    Aluno objaluno = new Aluno();
    objaluno.setId_Aluno(1); // Altere conforme necessário
    objaluno.setNome_Aluno("Teste");
    objaluno.setCPF_Aluno("12345678901");
    objaluno.setEndereco_Aluno("Rua Teste");
    objaluno.setTelefone_Aluno("987654321");
    objaluno.setIdade_Aluno("20");

    AlunoDAO instance = new AlunoDAO();
    
    // Chame o método cadastrarAluno
    instance.cadastrarAluno(objaluno);

    // Verifique se o aluno foi cadastrado corretamente
    Aluno alunoCadastrado = consultarAlunoDoBancoDeDados(objaluno.getId_Aluno());
    assertNotNull(alunoCadastrado); // Verifica se o aluno foi cadastrado com sucesso
    assertEquals("Teste", alunoCadastrado.getNome_Aluno());
    assertEquals("12345678901", alunoCadastrado.getCPF_Aluno());
    assertEquals("Rua Teste", alunoCadastrado.getEndereco_Aluno());
    assertEquals("987654321", alunoCadastrado.getTelefone_Aluno());
    assertEquals("20", alunoCadastrado.getIdade_Aluno());
}

    /**
     * Test of PesquisarAluno method, of class AlunoDAO.
     */
    @Test
    public void testPesquisarAluno() {
        System.out.println("PesquisarAluno");
        AlunoDAO instance = new AlunoDAO();
        ArrayList<Aluno> expResult = null;
        ArrayList<Aluno> result = instance.PesquisarAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AlterarAluno method, of class AlunoDAO.
     */
    @Test
    public void testAlterarAluno() {
        System.out.println("AlterarAluno");
        Aluno objaluno = null;
        AlunoDAO instance = new AlunoDAO();
        instance.AlterarAluno(objaluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ExcluirAluno method, of class AlunoDAO.
     */
    @Test
    public void testExcluirAluno() {
        System.out.println("ExcluirAluno");
        Aluno objaluno = null;
        AlunoDAO instance = new AlunoDAO();
        instance.ExcluirAluno(objaluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
