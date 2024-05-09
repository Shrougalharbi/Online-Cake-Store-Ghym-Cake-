package project.pkg251;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Cake store");
        System.out.println("____________________________________\n");
        System.out.println("What you want today ? : \n");
        System.out.println("1-Browse Cake \n"
                + "2-Order Cake \n"
                + "3-Rating Cake \n"
                + "4-Pay for the order\n"
                + "5-Customer Support\n");

        int choiseList = input.nextInt();

        switch (choiseList) {
            //Cake();

            case 1:
              Cake cake= new Cake();
                 cake.Search();
                break;
            //Order()
            case 2:
               Order order = new Order();
                  order.printOrderDetailsToFile();
               break;
               
               //Rating();
            case 3:
               System.out.println("Enter the name of the cake you want to rate : ");
               String name= input.next();
               Cake ratecake= new Cake();
               ratecake=ratecake.toRate(name);
               CakeReview customer = new CakeReview("Shroug Alahrbi" ,"This cake was delicious and moist. The frosting was perfect and not too sweet. I would definitely recommend it!", 5);
               ratecake.set(customer);
               System.out.println(ratecake.review());
               break;
            //pay
             case 4:
               Payment pay=new Payment();
               pay.choosePaymentMethod();
               System.out.println("Enter Credit Card Number: ");
               String number=input.next();
               pay.addCreditCard(number);
               break;

            //Customer Support();
            case 5:
                UserInquriy.start();
            default:
                System.exit(0);
        }
            
    }
}
