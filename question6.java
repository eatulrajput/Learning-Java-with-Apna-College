import java.util.*;
public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to create table");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i < 11; i++) {
            System.out.println(n * i);
        }
    }

}
