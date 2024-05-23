import java.util.Scanner;

// Class declaration
public class Question22 {
    // Main method
    public static void main(String[] args) {
        // Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Prompting for the number of rows
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        
        // Closing scanner
        input.close();

        // Nested loops to print a pattern of spaces and numbers
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print numbers
            int num = 1;
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
