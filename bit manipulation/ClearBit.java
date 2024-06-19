public class ClearBit {
    public static void main(String[] args){
        int n = 5; // 0101
        int pos = 1;
        int bitMask = 2 << pos;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
