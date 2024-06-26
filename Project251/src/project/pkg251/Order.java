
package project251;

import java.io.*;
import java.util.*;


class Order {
    private String customerName;
    private String phoneNumber;
    private Cake cakeOrdered;

    public Order() throws FileNotFoundException {
        enterOrderDetails();
    }

    private void enterOrderDetails() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for customer details
        System.out.println("Enter customer name:");
        customerName = scanner.nextLine();
        
        System.out.println("Enter phone number:");
        phoneNumber = scanner.nextLine();
        boolean found = checkCustomerExists(customerName,  phoneNumber);
        if (!found){
             System.out.println("You are not recognized as a customer. You cannot place an order.");
             System.exit(0);
        }

        // Prompt user for cake details
        System.out.println("Enter cake name:");
        String cakeName = scanner.nextLine();
        System.out.println("Enter cake flavor:");
        String flavor = scanner.nextLine();
        System.out.println("Enter number of layers:");
        int layers = scanner.nextInt();
        System.out.println("Enter cake size (separate sizes with spaces, e.g., Small Medium Large):");
        String size = scanner.next();
        
        
        // Assuming cakes ArrayList is already populated with cake objects   
        cakeOrdered = new Cake();
        cakeOrdered=cakeOrdered.findCustomerCake(cakeName, flavor, layers, size);
        
        

        scanner.close();
    }

    public void printOrderDetailsToFile() {
    try {
        FileWriter writer = new FileWriter("OrderDetails.txt", true);
        writer.write("Customer Name: " + customerName + "\n");
        writer.write("Phone Number: " + phoneNumber + "\n");
        writer.write("Cake Details: \n");
        writer.write("Cake Name: " + cakeOrdered.getCake_name() + "\n");
        writer.write("Flavor: " + cakeOrdered.getFlavor() + "\n");
        writer.write("Layers: " + cakeOrdered.getLayers() + "\n");
        writer.write("Occasion: " + cakeOrdered.getOccasion() + "\n");
        writer.write("Size: "+ cakeOrdered.getCSize());
        writer.write("\nPrice: ");
        writer.write(cakeOrdered.getPrice(cakeOrdered.getCSize()) + " ");
        writer.write("\n\n");
        writer.close();
        System.out.println("Order details written to file successfully!");
    } catch (IOException e) {
        System.err.println("An error occurred while writing to file: " + e.getMessage());
    }
}

    public boolean checkCustomerExists(String customerName, String phoneNumber) throws FileNotFoundException  {
        File orderFile = new File("Customers.txt");
        Scanner scanner = new Scanner(orderFile);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains("Customer Name: " + customerName) && line.contains("Phone Number: " + phoneNumber)) {
                scanner.close();
                return true;
            }
        }

        scanner.close();
        
        return false;
    }


    public static void main(String[] args) throws FileNotFoundException {
        Cake cake= new Cake();
        Order order = new Order();
        order.printOrderDetailsToFile();
    }
}
