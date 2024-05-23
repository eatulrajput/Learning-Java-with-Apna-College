import java.util.*;

// Class declaration
public class GreaterOrLesser {
    // Main method
    public static void main(String[] args) {
        // Prompting for input of the first number
        System.out.println("Enter the first number please!");
        
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Reading the first number
        int num1 = sc.nextInt();
        
        // Prompting for input of the second number
        System.out.println("Enter the second number please!");
        
        // Reading the second number
        int num2 = sc.nextInt();
        
        // Closing scanner
        sc.close();
        
        // Comparing the two numbers
        if (num1 == num2) {
            // Displaying result for equality
            System.out.println("a is equal to b");
        } else if (num1 > num2) {
            // Displaying result for num1 greater than num2
            System.out.println("a is greater than b");
        } else {
            // Displaying result for num1 smaller than num2
            System.out.println("a is smaller than b");
        }
    }
}
