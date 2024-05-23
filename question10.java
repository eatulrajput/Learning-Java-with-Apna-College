import java.util.*;

// Class declaration
public class Question10 {
    // Main method
    public static void main(String[] args){
        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompting for input
        System.out.println("Enter number 0 or 1");
        System.out.println("0 for Stop");
        System.out.println("1 for Continue");

        // Reading input number
        int n = sc.nextInt();

        // Switch case based on input number
        switch (n) {
            case 1: {
                // Prompting for marks input
                System.out.println("Enter the marks of the student");

                // Reading marks
                int marks = sc.nextInt();

                // Closing scanner
                sc.close();

                // Checking and displaying message based on marks
                if (marks >= 90) {
                    System.out.println("This is good");
                } else if (marks >= 60) {
                    System.out.println("This is also good");
                } else {
                    System.out.println("This is good as well");
                }
            }
            break;
            case 0: 
                System.out.println("No operation is applied!");
                break;
            default: 
                System.out.println("Enter 0 or 1 please!");
                break;
        }
    }
}
