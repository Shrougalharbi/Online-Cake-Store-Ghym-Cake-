/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package project.pkg251;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
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
 * @author amsjf
 */
public class UserInquriyTest {

    public UserInquriyTest() {
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
     * Test of liveChat method, of class UserInquriy.
     */
    @Test
    public void testLiveChat() {
        String input = "add review";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        String expectedResult = "i can not add review";
        String result = UserInquriy.liveChat();

        assertEquals(expectedResult, result);
       
    }

    /**
     * Test of SendEmile method, of class UserInquriy.
     */
    @Test
    public void testSendEmile() {
        System.out.println("");
        UserInquriy inquiry = new UserInquriy("shahd", "shahd@gmile.com", 123);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        inquiry.SendEmile();

        String expectedResult = "_________________________" + System.getProperty("line.separator");
        expectedResult += "Welcome shahd . " + System.getProperty("line.separator");
        expectedResult += "\n Our emile is : cakeStore111@gmail.com " + System.getProperty("line.separator");

        assertEquals(expectedResult, out.toString());

    }

}
