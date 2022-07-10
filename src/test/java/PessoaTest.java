/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.trabalhotestes.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class PessoaTest {
    
    public PessoaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Teste de sucesso para o método obterClassificacao
     */
    @Test
    public void testPessoaToStringSucesso() {
        Object pessoa = new Pessoa("Mary", 50.1f, 170f, 22);
        assertEquals("Mary, 50.1kg, 170.0cm, 22 anos", pessoa.toString());
    }
    
    /**
     * Teste de sucesso para o método obterClassificacao
     */
    @Test
    public void testPessoaPropriedadesSucesso() {
        Pessoa pessoa = new Pessoa("João Açaí", 50.131322f, 170.3333333f, 23);
        assertEquals("João Açaí", pessoa.nome);
        assertEquals(50.13f, pessoa.peso, 2);
        assertEquals(170.33f, pessoa.altura, 2);
        assertEquals(23, pessoa.idade);
    }   
}
