// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.

public class NumberSystemConversion {
    public static void main(String[] args) {
        int decimalNumber = 29; // Example decimal number
        String binaryString = "11101"; // Example binary string

        // Convert decimal to binary
        String binaryResult = decimalToBinary(decimalNumber);
        System.out.println("Decimal " + decimalNumber + " to binary: " + binaryResult);

        // Convert binary to decimal
        int decimalResult = binaryToDecimal(binaryString);
        System.out.println("Binary " + binaryString + " to decimal: " + decimalResult);
    }

    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        
        while (n > 0) {
            // Append the remainder of n divided by 2 to the binary string
            binary.append(n % 2);
            // Divide n by 2
            n /= 2;
        }
        
        // The binary string is built in reverse order, so reverse it
        return binary.reverse().toString();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        
        for (int i = 0; i < length; i++) {
            // Get the bit value (0 or 1) at the current position
            int bit = binary.charAt(length - 1 - i) - '0';
            // Add the bit value multiplied by 2 raised to the power of the current position
            decimal += bit * Math.pow(2, i);
        }
        
        return decimal;
    }
}
