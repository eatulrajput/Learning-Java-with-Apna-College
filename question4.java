import java.util.Scanner;

// Class declaration
public class Question4 {
    // Main method
    public static void main(String[] args){
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompting for input
        System.out.println("Enter a number to print the table here: ");
        
        // Reading input number
        int number = sc.nextInt();
        
        // Closing scanner
        sc.close();
        
        // Calculating and printing the table
        System.out.println("The table of " + number + " is :");
        System.out.println(number * 1);
        System.out.println(number * 2);
        System.out.println(number * 3);
        System.out.println(number * 4);
        System.out.println(number * 5);
        System.out.println(number * 6);
        System.out.println(number * 7);
        System.out.println(number * 8);
        System.out.println(number * 9);
        System.out.println(number * 10);
    }
}
