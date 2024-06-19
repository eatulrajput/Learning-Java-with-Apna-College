// Write a program to find if a number is a power of 2 or not.

public class PowerOfTwo {
    public static void main(String[] args) {
        int number = 16; // You can change this to test other numbers

        // Check if the number is greater than 0 and if (number & (number - 1)) == 0
        if (number > 0 && (number & (number - 1)) == 0) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }
    }
}