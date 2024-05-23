import java.util.Scanner;

// Class declaration
public class Question14 {
    // Main method
    public static void main(String[] args){
        // Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Prompting for the number of rows
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        
        // Closing scanner
        input.close();
        
        // Nested loops to print a triangular pattern of stars
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
