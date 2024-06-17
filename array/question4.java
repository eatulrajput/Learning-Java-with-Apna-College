// Take an array as an input from the user. Search for the given number x and print the index at which it occurs.
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();
        sc.close();

        // Search for x
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index: " + i);
                return; // Exit the method once the number is found
            }
        }

        // If we reach here, x was not found
        System.out.println("x not found in the array");
    }
}
