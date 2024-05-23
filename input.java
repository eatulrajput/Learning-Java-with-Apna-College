import java.util.*;

// Class declaration
public class Input {
    // Main method
    public static void main(String[] args) {
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Reading input as a single line
        String name = sc.nextLine();
        
        // Displaying the input
        System.out.println(name);
        
        // Closing scanner
        sc.close();
    }
}
