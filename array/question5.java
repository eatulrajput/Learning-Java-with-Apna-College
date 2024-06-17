// Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        // Input
        System.out.println("Enter the names here:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }
        sc.close();
        // Output
        for (int i = 0; i < names.length; i++) {
            System.out.println("name " + (i + 1) + " is :" + names[i]);

        }

    }
}
