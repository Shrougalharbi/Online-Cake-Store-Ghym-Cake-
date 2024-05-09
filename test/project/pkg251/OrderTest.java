/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg251;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class OrderTest {

    public OrderTest() {
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
     * Test of checkCustomerExists method, of class Order.
     */
    @Test
    public void testCheckCustomerExists() throws Exception {
        System.out.println("checkCustomerExists");
        String customerName = "Raghad";
        String phoneNumber = "0511111111";
        Order instance = new Order();
        boolean expResult = true;
        boolean result = instance.checkCustomerExists(customerName, phoneNumber);
        assertEquals(expResult, result);

    }

    @Test
    public void testCheckCustomerNotExists() throws Exception {
        System.out.println("checkCustomerNotExists");
        String customerName = "Maha";
        String phoneNumber = "051115511";
        Order instance = new Order();
        boolean expResult = false;
        boolean result = instance.checkCustomerExists(customerName, phoneNumber);
        assertEquals(expResult, result);
    }

    /**
     * Test of PrintOrderDetailsToFile method, of class Order.
     */
 @Test
public void testPrintOrderDetailsToFile() throws Exception {
    
    // Create an Order 
    Order order = new Order();
    Cake cakeOrdered = new Cake();
    String customerName = "Raghad";
    String phoneNumber = "0511111111";
    cakeOrdered = cakeOrdered.findCustomerCake("Chocolate", "Chocolate", 1, "small");
    order.printOrderDetailsToFile(cakeOrdered, "small", customerName, phoneNumber);
    System.out.println("testPrintOrderDetailsToFile");
    
    // Read the content of the file of the order
    StringBuilder contentBuilder = new StringBuilder();
    FileReader fileReader = new FileReader("OrderDetails.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);

    String line;
    while ((line = bufferedReader.readLine()) != null) {
        contentBuilder.append(line).append("\n");
    }
    bufferedReader.close();
    String content = contentBuilder.toString();
    
    // Read the content of the file of the Test order
    StringBuilder TestBuilder2 = new StringBuilder();
    FileReader TestReader2 = new FileReader("OrderDetailsTest.txt");
    BufferedReader bufferedReader2 = new BufferedReader(TestReader2);

    String line2;
    while ((line2 = bufferedReader2.readLine()) != null) {
        TestBuilder2.append(line2).append("\n");
    }
    bufferedReader2.close();
    String content2 = contentBuilder.toString();

    // Assert that the content matches the expected content
    assertEquals(content2, content);
}

}// end test
