package project.pkg251;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) throws FileNotFoundException, Exception {

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
                  order.enterOrderDetails();
               break;
               
               //Rating();
            case 3:
               System.out.println("Enter your name: ");
               String name= input.next();
               
               System.out.println("Enter the name of the cake you want to rate : ");
               String Cake= input.next();
            
               System.out.println("Enter Your Rate : ");
               String rate= input.next();
               
               System.out.println("Rate From 0 to 5 Stars: ");
               int rateing= input.nextInt();
               
               Cake ratecake= new Cake();
               ratecake=ratecake.toRate(Cake);
               CakeReview customer = new CakeReview(name ,rate, rateing);
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