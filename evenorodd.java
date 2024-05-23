import java.util.*;

// Class declaration
public class EvenOrOdd {
    // Main method
    public static void main(String[] args){
        // Prompting for input
        System.out.println("Enter a number please!");
        
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Reading input number
        int number = sc.nextInt();
        
        // Closing scanner
        sc.close();
        
        // Checking if the number is even or odd
        if(number % 2 == 0){
            // Displaying result for even number
            System.out.println("It is an even number");
        }
        else{
            // Displaying result for odd number
            System.out.println("It is an odd number");
        }
    }
}
