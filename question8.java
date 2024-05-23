import java.util.*;

// Class declaration
public class Question8 {
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
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
