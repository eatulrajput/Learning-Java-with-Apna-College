import java.util.Scanner;

public class question22 {
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
            // Print numbers
            int num = 1;
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
