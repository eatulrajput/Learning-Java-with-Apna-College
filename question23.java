import java.util.Scanner;

// Class declaration
public class Question23 {
    // Main method
    public static void main(String[] args) {
        // Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Prompting for the number of rows
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        
        // Closing scanner
        input.close();

        // Nested loops to print a pattern of spaces and numbers for a palindrome triangle
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print left half of the palindrome
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Print right half of the palindrome (excluding 1 to avoid duplication)
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
