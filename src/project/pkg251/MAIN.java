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


    }
}
