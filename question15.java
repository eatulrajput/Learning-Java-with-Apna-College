import java.util.Scanner;

// Class declaration
public class Question15 {
    // Main method
    public static void main(String[] args){
        // Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Prompting for the number of rows
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        
        // Closing scanner
        input.close();
        
        // Nested loops to print an inverted triangular pattern of stars
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
