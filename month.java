import java.util.*;

// Class declaration
public class Month {
    // Main method
    public static void main(String[] args){
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompting for input
        System.out.println("Enter the month number");
        
        // Reading input
        int number = sc.nextInt();
        
        // Closing scanner
        sc.close();
        
        // Switch case to display month based on input number
        switch (number) {
            case 1: 
                System.out.println("January");
                break;
            case 2: 
                System.out.println("February");
                break;
            case 3: 
                System.out.println("March");
                break;
            case 4: 
                System.out.println("April");
                break;
            case 5: 
                System.out.println("May");
                break;
            case 6: 
                System.out.println("June");
                break;
            case 7: 
                System.out.println("July");
                break;
            case 8: 
                System.out.println("August");
                break;
            case 9: 
                System.out.println("September");
                break;
            case 10: 
                System.out.println("October");
                break;
            case 11: 
                System.out.println("November");
                break;
            case 12: 
                System.out.println("December");
                break;
            default:
                // Handling invalid input
                System.out.println("Please enter between 1 to 12 only!");
                break;
        }
    }
}
