import java.util.*;

public class question27 {
    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int product = calculateProduct(a, b);
        System.out.println("Product of two numbers is: " + product);
    }
}
