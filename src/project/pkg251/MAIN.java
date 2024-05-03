package project.pkg251;

import java.util.Scanner;

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
        
        Payment pay=new Payment();
        pay.choosePaymentMethod();
        System.out.println("Enter Credit Card Number: ");
        String number=input.nextLine();
        pay.addCreditCard(number);
                
        
       
        
        System.out.println(Cakename.getCake_name()+Customer.addString());
    }
}
