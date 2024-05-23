import java.util.Scanner;

// Class declaration
public class Question28 {
    // Method to calculate and print factorial of a number
    public static void printFactorial(int n) {
        // Check if the number is negative
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }

        // Initialize factorial to 1
        int factorial = 1;

        // Calculate factorial using a loop
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }

        // Print the factorial
        System.out.println(factorial);
    }

    // Main method
    public static void main(String[] args) {
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompting for the number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Closing scanner
        sc.close();
        
        // Calling the method to print the factorial
        printFactorial(n);
    }
}
