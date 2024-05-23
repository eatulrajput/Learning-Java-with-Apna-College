import java.util.Scanner;

// Class declaration
public class Question27 {
    // Method to calculate the product of two numbers
    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    // Main method
    public static void main(String[] args) {
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompting for the two numbers
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        
        // Closing scanner
        sc.close();
        
        // Calling the method to calculate the product and printing the result
        int product = calculateProduct(a, b);
        System.out.println("Product of two numbers is: " + product);
    }
}
