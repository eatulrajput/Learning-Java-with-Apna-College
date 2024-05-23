import java.util.*;

// Class declaration
public class Question5 {
    // Main method
    public static void main(String[] args) {
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompting for input
        System.out.print("Enter a number to find sum:");
        
        // Reading input number
        int n = sc.nextInt();
        
        // Closing scanner
        sc.close();
        
        // Initializing sum variable
        int sum = 0;
        
        // Loop to calculate sum of numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        
        // Printing the sum
        System.out.println(sum);
    }
}
