
// Print the spiral order matrix as output for a given matrix of numbers. 
import java.util.Scanner;

public class SpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // output in spiral order
        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;
        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(numbers[top][i] + " ");
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(numbers[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                // Print bottom row
                for (int i = right; i >= left; i--) {
                    System.out.print(numbers[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                // Print left column
                for (int i = bottom; i >= top; i--) {
                    System.out.print(numbers[i][left] + " ");
                }
                left++;
            }
        }
    }
}
