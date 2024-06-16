import java.util.*;

public class Question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close(); // Closing the scanner to avoid resource leak

        int sum = 0;
        // Loop through numbers from 0 to the input number (inclusive)
        for (int i = 0; i <= n; i++) {
            // Checking if the current number is odd
            if (i % 2 != 0) {
                // Adding the odd number to the sum
                sum = sum + i;
            }
        }
        // Printing the sum of odd numbers
        System.out.println(sum);
    }
}
