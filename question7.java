import java.util.*;

// Class declaration
public class Question7 {
    // Main method
    public static void main(String[] args) {
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompting for input
        System.out.print("Enter a number here:");
        
        // Reading input number
        int n = sc.nextInt();
        
        // Closing scanner
        sc.close();
        
        // Loop to print even numbers up to n
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
