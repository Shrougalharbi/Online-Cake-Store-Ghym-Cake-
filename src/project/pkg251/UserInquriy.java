
package project.pkg251;

import java.util.Scanner;
public class UserInquriy {
     private String userName;
    private String userEmail;
    private int inquiryNumber;
    private String inquiryQuestion;

    public UserInquriy(String userName, String userEmail, int inquiryNumber, String inquiryQuestion) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.inquiryNumber = inquiryNumber;
        this.inquiryQuestion = inquiryQuestion;
        
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public int getInquiryNumber() {
        return inquiryNumber;
    }

    public String getInquiryQuestion() {
        return inquiryQuestion;
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

    public void setInquiryQuestion(String inquiryQuestion) {
        this.inquiryQuestion = inquiryQuestion;
    }

    void liveChat() {
        Scanner Chat = new Scanner(System.in);

        System.out.println("_________________________");
        System.out.println("Welcome "+ userName +" . How i can help you ? \n");
        String User = Chat.next();
        System.out.println("\n OK . we will solve your problem immediately . please check your emile");
    }

    void SendEmile() {
        System.out.println("_________________________");
        System.out.println("Welcome "+ userName +" . ");
        System.out.println("\n Our emile is : cakeStore111@gmail.com ");
    }
}
