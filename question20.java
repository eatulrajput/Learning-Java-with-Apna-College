import java.util.Scanner;

// Class declaration
public class Question20 {
    // Main method
    public static void main(String[] args) {
        // Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Prompting for the number of rows
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        
        // Closing scanner
        input.close();
        
        // Nested loops to print a pattern of 1s and 0s based on row and column indices
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}
