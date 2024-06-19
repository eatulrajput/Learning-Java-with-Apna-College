import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        sc.close();
        // Operation == 1 :: Set Operation = 0 :: Clear
        int n = 5; // 0101 -> 0111 -> decimal : 7
        int pos = 1;
        int bitMask = 1 << pos;
        if (operation == 1) {
            // Set operation
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // Clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
