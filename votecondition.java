import java.util.*;

// Class declaration
public class VoteCondition {
    // Main method
    public static void main(String[] args){
        // Prompt the user to enter their age
        System.out.println("Enter your age please!");
        
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Read the age entered by the user
        int age = sc.nextInt();
        
        // Closing the scanner
        sc.close();
        
        // Check if the age is greater than 18
        if(age > 18) {
            System.out.println("You can vote now, you are considered as an adult now!");
        } else {
            System.out.println("You can't vote now, you are not an adult");
        }
    }
}
