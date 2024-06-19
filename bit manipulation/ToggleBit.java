// Write a program to toggle a bit a position = “pos” in a number “n”
public class ToggleBit {
    public static void main(String[] args) {
        int n = 29; // You can change this to test other numbers
        int pos = 3; // You can change this to test other positions (0-based index)

        // Create a bitmask with a 1 at the given position
        int bitmask = 1 << pos;

        // Toggle the bit at the given position using XOR
        int toggledNumber = n ^ bitmask;

        // Print the original number and the toggled number
        System.out.println("Original number: " + n);
        System.out.println("Toggled number: " + toggledNumber);
    }
}
