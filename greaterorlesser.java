import java.util.*;

public class greaterorlesser {
    public static void main(String[] args) {
        System.out.println("Enter the first number number please!");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter the second number please!");
        int num2 = sc.nextInt();
        sc.close();
        if (num1 == num2) {
            System.out.println("a is equal to b");
        } else if (num1 > num2) {
            System.out.println("a is greater than b");

        } else {
            System.out.println("a is smaller than b");
        }

    }
}
