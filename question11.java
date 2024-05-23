import java.util.*;

// Class declaration
public class Question11 {
   // Main method
   public static void main(String args[]) {
       // Scanner object for input
       Scanner sc = new Scanner(System.in);
       
       // Reading input number
       int n = sc.nextInt();
       
       // Closing scanner
       sc.close();

       // Initializing a boolean variable to track if the number is prime
       boolean isPrime = true;
       
       // Loop to check if the number is prime
       for(int i = 2; i <= n / 2; i++) {
           if(n % i == 0) {
               isPrime = false;
               break;
           }
       }

       // Checking and printing if the number is prime or not
       if(isPrime) {
           if(n == 1) {
               System.out.println("This is neither prime nor composite");
           } else {
               System.out.println("This is a prime number");
           }
       } else {
           System.out.println("This is not a prime number");
       }
   }   
}
