/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg251;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author narje
 */
public class PaymentTest {
    
    @Test
    public void testAddCreditCard() {
      Payment payment = new Payment();
      String creditCardNumber = "1345622898865";
      payment.addCreditCard(creditCardNumber);
      List<String> creditCards = payment.getCreditCards();
      assertTrue(creditCards.contains(creditCardNumber));
    }
  
}
