import java.util.*;

// Class declaration
public class Question6 {
    // Main method
    public static void main(String[] args) {
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompting for input
        System.out.println("Enter a number to create table");
        
        // Reading input number
        int n = sc.nextInt();
        
        // Closing scanner
        sc.close();
        
        // Loop to print the table of the input number
        for (int i = 1; i < 11; i++) {
            System.out.println(n * i);
        }
    }
}
