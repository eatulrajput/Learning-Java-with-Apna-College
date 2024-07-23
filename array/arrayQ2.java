import java.util.Scanner;

public class arrayQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Close the Scanner as we no longer need to take input
        sc.close();

        // Print the elements of the array
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
