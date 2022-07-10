import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */

/**
 *
 * @author Aluno
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(value={IMCTest.class, PessoaTest.class})
public class IMCTestSuite extends TestCase {    
    public IMCTestSuite(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("IMCTestSuite");
        suite.addTest(new TestSuite(IMCTest.class));
        suite.addTest(new TestSuite(PessoaTest.class));
        return suite;
    }
}
