package project.pkg251;

import java.util.Scanner;

public class UserInquriy {

    private static String userName;
    private String userEmail;
    private int inquiryNumber;

    //==================================================================
    //constructor of user information  
    public UserInquriy(String userName, String userEmail, int inquiryNumber) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.inquiryNumber = inquiryNumber;

    }
    //==================================================================

//GETTERS AND SETTRS
    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public int getInquiryNumber() {
        return inquiryNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setInquiryNumber(int inquiryNumber) {
        this.inquiryNumber = inquiryNumber;
    }
    //==================================================================

    //METHOOD TO START THE SERVICE AND TRANSFER IT TO APPROPRITE SERVICE 
    static void start() {
        Scanner input = new Scanner(System.in);

        System.out.println("____________________________________\n");

        System.out.print("Please enter your name:");
        String userName = input.next();
        System.out.print("\n Please enter your email:");
        String userEmail = input.next();
        int inquiryNumber = (int) (Math.random() * 10);

        System.out.println("\n If you want a live chat please Enter 1 : ");
        System.out.println("Or If you need Email please Enter 2 : ");
        int user = input.nextInt();

        // Create UserInquiry object 
        UserInquriy inquriy = new UserInquriy(userName, userEmail, inquiryNumber);

        while (true) {
            switch (user) {
                case 1:
                    inquriy.liveChat();
                    break;

                case 2:
                    inquriy.SendEmile();
                    break;

                default:
                    System.out.println("Invalid input. Please enter 1 for live chat or 2 for Email support.");
                    user = input.nextInt();
                    continue;

            }
            break;
        }
        System.out.println("_____________________________\n");
        System.out.println("THANK YOU TO VISIT US :) ");
        System.out.println("_____________________________\n");

    }
    //==================================================================

    //METHOOD TO CHAT WITH OWNER
     public static String liveChat() {
        Scanner Chat = new Scanner(System.in);

        System.out.println("_________________________");
        System.out.println("Welcome " + userName + " . How i can help you ? \n");
        String User = Chat.nextLine();
        System.out.println("\n OK . we will solve your problem immediately . please check your Email");
        return "i can not "+User ;
    }
    //==================================================================

    //METHOOD TO SEND EMILE
    void SendEmile() {
        System.out.println("_________________________");
        System.out.println("Welcome " + userName + " . ");
        System.out.println("\n Our Email is : cakeStore111@gmail.com ");
    }
}
