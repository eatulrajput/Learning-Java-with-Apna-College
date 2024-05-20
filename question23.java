import java.util.Scanner;

public class question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        input.close();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print left half of the palindrome
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Print right half of the palindrome (excluding 1 to avoid duplication)
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
