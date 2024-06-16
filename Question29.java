import java.util.*;

public class Question29 {
    // Method to calculate the average of three numbers
    public static int getAverage(int a, int b, int c){
        int average = (a + b + c) / 3;
        return average;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter the first number
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        // Prompting the user to enter the second number
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        // Prompting the user to enter the third number
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        sc.close(); // Closing the scanner to avoid resource leak

        // Calculating the average using the getAverage method
        int average = getAverage(a, b, c);
        System.out.println("The average of three numbers is: " + average);

    }
}
