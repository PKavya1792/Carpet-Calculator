import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.loadLibrary;

public class Shop {

    static double totalAmount = 0;
    static Product[] inventory = {new Product("Business Ritual Women’s,", 65.39, "Apparel", 4, "Sleeve Top"),
            new Product("The Art of Computer Programming", 190.54, "Books", 9, "Donald E. Knuth"),
            new Product("Men’s Business Casual Shirt ", 57.10, "Apparel", 2, 'M', "Teal"),
            new Product("Organic Turmeric Soap", 11.25, "Bath & Beauty", 1),
            new Product("Head First Design Pattern", 37.35, "Books", 3, "Eric Freeman")};

    static void displayMenu() {
        System.out.println("\n Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4)");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println( i + " : " + inventory[i].getName());
        }
    }

    public static void main(String[] args) {
        int userInput;
        Scanner in = new Scanner(System.in);
        do {
            displayMenu();
           // userInput = 0;

            System.out.println("Enter number");
            userInput = in.nextInt();
            //System.out.println(userInput);

            if (userInput >= 0 && userInput <= 4) {
                if (inventory[userInput].buy()) {
                    System.out.println("Your purchase was successful");
                    totalAmount += inventory[userInput].getPrice();
                } else System.out.println("Sorry! This product is out of stock.");
            } else {
                break;
            }
        } while (userInput >= 0 && userInput <= 4);
        System.out.println("Thank you for shopping with us! The total amount is " + totalAmount);
        in.close(); // closes the scanner
    }
}






