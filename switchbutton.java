import java.util.*;

// Class declaration
public class switchbutton {
    // Main method
    public static void main(String[] args){
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter a button number
        System.out.println("Enter your button number here!");
        int button = sc.nextInt();
        
        // Closing the scanner
        sc.close();
        
        // Switch statement to print a greeting based on the button number
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default: 
                // Handling the case of an invalid button number
                System.out.println("Wrong option, choose again!");
                break;
        }
    }
}
