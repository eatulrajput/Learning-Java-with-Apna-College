import java.util.Scanner;

// Class declaration
public class Question25 {
    // Method to print the given name
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    // Main method
    public static void main(String[] args) {
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompting for the name
        System.out.print("Enter your name: ");
        String name = sc.next();
        
        // Closing scanner
        sc.close();
        
        // Calling the method to print the name
        printMyName(name);
    }
}
