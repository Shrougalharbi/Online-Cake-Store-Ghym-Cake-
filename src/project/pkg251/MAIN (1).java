package project.pkg251;

import java.util.Scanner;
import project251.Payment;

public class MAIN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Cake store");
        System.out.println("____________________________________\n");
        System.out.println("What you want today ? : \n");
        System.out.println("1-Browse Cake \n"
                + "2-Rating Cake \n"
                + "3-Customer Support\n");

        int choiseList = input.nextInt();

        switch (choiseList) {
            //Cake();

            case 1:

                break;
            //Rating();
            case 2:

                break;

            //Customer Support();
            case 3:
                UserInquriy.start();
            default:
                System.exit(0);
        }

        Cake Cakename=new Cake();
        CakeReview Customer = new CakeReview("Shroug Alahrbi" ,"This cake was delicious and moist. The frosting was perfect and not too sweet. I would definitely recommend it!", 5);
      
       
        
        System.out.println(Cakename.getCake_name()+Customer.addString());
    }
    
    Payment payment = new Payment();
        Scanner scanner = new Scanner(System.in);

        
         // Choose payment method
        payment.choosePaymentMethod();
        // Add credit cards
        System.out.print("Enter credit card number (or 'done' to finish): ");
        String creditCardNumber = scanner.nextLine();
        payment.addCreditCard(creditCardNumber);
        
}
