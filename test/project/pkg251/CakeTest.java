package project.pkg251;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lamaa
 */
public class CakeTest {
    public  Cake cake;
    
    public CakeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws FileNotFoundException  {
        cake= new Cake();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of DisplayDetails method, of class Cake.
     */
    @Test
    public void testDisplayCakeDetails() throws FileNotFoundException  {
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        File inputCakes = new File("Cakes.txt");
        Scanner input = new Scanner(inputCakes);
        
        while(input.hasNext()){
            String cake_name=input.next();
            String occasion=input.next();
            String flavors=input.next();
            int layer=input.nextInt();
            String[] size=new String[3];
            for (int i=0;i<3;i++){
             size[i]=input.next();
            }
            double[] prices=new double[3];
            for (int i=0;i<3;i++){
             prices[i]=input.nextInt();
            }
            
        Cake newCake = new Cake(cake_name,occasion,flavors,layer,size,prices); 
        
        newCake.displayCakeDetails();
        }
        input.close();
        
        String expectedResult = "| Chocolate      | Chocolate         | 1      | Eid        | 1: small  2: medium  3: large     | 1: 25.0  2: 30.0  3: 40.0   | " +System.getProperty("line.separator");
        expectedResult += "| Vanilla        | Vanilla           | 1      | Wedding    | 1: small  2: medium  3: large     | 1: 35.0  2: 45.0  3: 55.0   | "+System.getProperty("line.separator");
        expectedResult += "| Red-Velvet     | Red-Velvet        | 2      | Eid        | 1: small  2: medium  3: large     | 1: 25.0  2: 35.0  3: 55.0   | "+System.getProperty("line.separator");
        expectedResult += "| Lemon          | Lemon             | 3      | Graduation | 1: small  2: medium  3: large     | 1: 30.0  2: 45.0  3: 55.0   | "+System.getProperty("line.separator");
        expectedResult += "| Carrot         | Carrot            | 2      | Holiday    | 1: small  2: medium  3: large     | 1: 25.0  2: 35.0  3: 45.0   | "+System.getProperty("line.separator");
        expectedResult += "| Marble         | Chocolate&Vanilla | 3      | Graduation | 1: small  2: medium  3: large     | 1: 25.0  2: 35.0  3: 45.0   | "+System.getProperty("line.separator");
        expectedResult += "| Black-Forest   | Black-Forest      | 1      | Eid        | 1: small  2: medium  3: large     | 1: 25.0  2: 30.0  3: 40.0   | "+System.getProperty("line.separator");
        expectedResult += "| Strawberry     | Strawberry        | 2      | Wedding    | 1: small  2: medium  3: large     | 1: 35.0  2: 45.0  3: 55.0   | "+System.getProperty("line.separator");
        expectedResult += "| Coconut        | Coconut           | 2      | Eid        | 1: small  2: medium  3: large     | 1: 25.0  2: 35.0  3: 55.0   | "+System.getProperty("line.separator");
        expectedResult += "| Pineapple      | Pineapple         | 1      | Holiday    | 1: small  2: medium  3: large     | 1: 25.0  2: 35.0  3: 45.0   | "+System.getProperty("line.separator");
        expectedResult += "| Blueberry      | Blueberry         | 2      | Graduation | 1: small  2: medium  3: large     | 1: 25.0  2: 35.0  3: 45.0   | " +System.getProperty("line.separator");
                                                 
        assertEquals(expectedResult, out.toString());
    }

}
