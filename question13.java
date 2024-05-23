import java.util.Scanner;

// Class declaration
public class Question13 {
    // Main method
    public static void main(String[] args){
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompting for the number of rows
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        
        // Prompting for the number of columns
        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();
        
        // Closing scanner
        sc.close();
        
        // Nested loops to print a hollow rectangular pattern of stars
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if (i == 1 || j == 1 || i == row || j == column) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
