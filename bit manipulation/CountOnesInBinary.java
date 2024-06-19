public class CountOnesInBinary {
    public static void main(String[] args) {
        int n = 29; // You can change this to test other numbers

        // Initialize the counter
        int count = 0;

        // Loop until n becomes 0
        while (n != 0) {
            // Increment the count if the last bit is 1
            count += n & 1;

            // Right shift n by 1 to check the next bit
            n >>= 1;
        }

        // Print the number of 1s in the binary representation
        System.out.println("Number of 1s in binary representation: " + count);
    }
}
