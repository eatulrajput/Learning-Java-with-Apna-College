import java.util.*;

public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here:");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }
    }

}