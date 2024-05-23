import java.util.*;

// Class declaration
public class Calculator {
    // Main method
    public static void main(String[] args){
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Input for the first number
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        
        // Input for the second number
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        
        // Displaying operation options
        System.out.println("Choose the operation you want to perform:");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        
        // Calculating results for each operation
        int sum = a + b;
        int sub = b - a;
        int mul = a * b;
        int div = a / b;
        
        // Input for operation choice
        int operation = sc.nextInt();
        
        // Closing scanner
        sc.close();
        
        // Switch case to perform selected operation
        switch (operation) {
            case 1: 
                // Addition
                System.out.println(sum);
                break;
            case 2: 
                // Subtraction
                System.out.println(sub);
                break;
            case 3: 
                // Multiplication
                System.out.println(mul);
                break;
            case 4: 
                // Division
                System.out.println(div);
                break;
            default: 
                // Handling wrong option
                System.out.println("Wrong Option, choose again!");
                break;
        }
    }
}
