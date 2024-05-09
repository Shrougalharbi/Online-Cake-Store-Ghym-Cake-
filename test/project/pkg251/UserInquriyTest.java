/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package project.pkg251;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author amsjf
 */
public class UserInquriyTest {
    
    public UserInquriyTest() {
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
     * Test of getUserName method, of class UserInquriy.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        UserInquriy instance = null;
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserEmail method, of class UserInquriy.
     */
    @Test
    public void testGetUserEmail() {
        System.out.println("getUserEmail");
        UserInquriy instance = null;
        String expResult = "";
        String result = instance.getUserEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInquiryNumber method, of class UserInquriy.
     */
    @Test
    public void testGetInquiryNumber() {
        System.out.println("getInquiryNumber");
        UserInquriy instance = null;
        int expResult = 0;
        int result = instance.getInquiryNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class UserInquriy.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        UserInquriy instance = null;
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserEmail method, of class UserInquriy.
     */
    @Test
    public void testSetUserEmail() {
        System.out.println("setUserEmail");
        String userEmail = "";
        UserInquriy instance = null;
        instance.setUserEmail(userEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInquiryNumber method, of class UserInquriy.
     */
    @Test
    public void testSetInquiryNumber() {
        System.out.println("setInquiryNumber");
        int inquiryNumber = 0;
        UserInquriy instance = null;
        instance.setInquiryNumber(inquiryNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class UserInquriy.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        UserInquriy.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of liveChat method, of class UserInquriy.
     */
    @Test
    public void testLiveChat() {
        System.out.println("liveChat");
        UserInquriy instance = null;
        instance.liveChat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SendEmile method, of class UserInquriy.
     */
    @Test
    public void testSendEmile() {
        System.out.println("SendEmile");
        UserInquriy instance = null;
        instance.SendEmile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
