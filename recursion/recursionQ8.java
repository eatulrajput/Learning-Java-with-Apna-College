// Print x^n (with stack height = logn)
public class recursionQ8 {

    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        // if n is even
        if (n % 2 == 0) {
            return calcPower(x, n/2) * calcPower(x, n/2);
        } else{
            // n is odd
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(x);
        System.out.println(n);
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
