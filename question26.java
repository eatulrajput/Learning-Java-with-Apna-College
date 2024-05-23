import java.util.Scanner;

// Class declaration
public class Question26 {
    // Method to calculate the sum of two numbers
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
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
        
        // Calling the method to calculate the sum and printing the result
        int sum = calculateSum(a, b);
        System.out.println("Sum of two numbers is: " + sum);
    }
}
