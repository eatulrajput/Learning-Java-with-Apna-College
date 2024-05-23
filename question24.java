import java.util.Scanner;

// Class declaration
public class Question24 {
    // Main method
    public static void main(String[] args) {
        // Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Prompting for the number of rows
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        
        // Closing scanner
        input.close();
       
        // Upper part of the pattern
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            int spaces = 2 * (n - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print("   ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            int spaces = 2 * (n - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print("   ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
