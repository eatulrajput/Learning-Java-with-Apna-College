import java.util.*;

public class Question31 {
    public static int oddSum(int n) {
        int sum = 0; // Initialize sum variable
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum; // Return the sum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        // Call the oddSum method with the input number and print the result
        System.out.println("Sum is: " + oddSum(n));
    }
}
