/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import com.mycompany.trabalhotestes.IMC;
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
public class IMCTest{
    
    public IMCTest() {
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
    public void testObterClassificacaoSucesso() {
        IMC imc = new IMC();
        float imcCalculado = 22.2f;
        String classificacao = imc.obterClassificacao(imcCalculado);

        assertEquals("Peso Ideal", classificacao);
    }

    /**
     * Teste de falha para o método obterClassificacao
     */
    @Test
    public void testObterClassificacaoFalha() {
        IMC imc = new IMC();
        float imcCalculado = 82.2f;
        
        String classificacao = imc.obterClassificacao(imcCalculado);
        assertNotSame("Peso Ideal", classificacao);
    }

    
    /**
     * Teste de sucesso para o método obterIMC
     */
    @Test
    public void testObterIMCSucesso() {
        IMC imc = new IMC();
        Pessoa pessoa = new Pessoa("Mary", 50f, 1.70f, 22);
        
        float imcCalculado = imc.obterIMC(pessoa);
        assertEquals(17.30f, imcCalculado, 0.01);
    }
    
    /**
     * Teste de sucesso para o método obterIMC
     */
    @Test
    public void testObterIMCFalha() {
        IMC imc = new IMC();
        Pessoa pessoa = new Pessoa("Mary", 50f, 1.70f, 22);
        
        float imcCalculado = imc.obterIMC(pessoa);
        
        // TODO: Encontrar um método assertNotEqual
        boolean igual = true;
        if (16 != Math.round(imcCalculado)) {
            igual = false;
        }
        assertFalse(igual);
    }
}
