
package project251;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Payment {
    private List<String> creditCards;
    private String paymentMethod;

    
    //constructor
    public Payment() {
        this.creditCards = new ArrayList<>();
    }

    public Payment(List<String> creditCards, String paymentMethod) {
        this.creditCards = creditCards;
        this.paymentMethod = paymentMethod;
    }

    // getters
    public List<String> getCreditCards() {
        return creditCards;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    // setters
    public void setCreditCards(List<String> creditCards) {
        this.creditCards = creditCards;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // menu for choosing payment method
    public void choosePaymentMethod() {
        // scanner to enter the numbers
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Payment Method Menu:");
        System.out.println("1. Visa");
        System.out.println("2. Mastercard");
        System.out.println("3. Mada");

        System.out.print("Enter your choice: ");
        int choice = scanner2.nextInt();
        switch (choice) {
            case 1:
                setPaymentMethod("Visa");
                System.out.println("Payment method: Visa");
                break;
            case 2:
                setPaymentMethod("Mastercard");
                System.out.println("Payment method: Mastercard");
                break;
            case 3:
                setPaymentMethod("Mada");
                System.out.println("Payment method: Mada");
                break;
        }
    }

    // adding credit card number to the array list
    public void addCreditCard(String creditCardNumber) {
        creditCards.add(creditCardNumber);
        System.out.println("Credit card " + creditCardNumber + " added");
    }

    // remove credit card number from the array list
    public void deleteCreditCard(String creditCardNumber) {
        boolean removed = creditCards.remove(creditCardNumber);
        if (removed) {
            System.out.println("Credit card " + creditCardNumber + " deleted");
        } else {
            System.out.println("Credit card " + creditCardNumber + " not found");
        }
    }

    // check if the credit card exists
    public boolean hasCreditCard(String creditCardNumber) {
        return creditCards.contains(creditCardNumber);
    }
   
}