import java.util.Scanner;

public class question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print the table here: ");
        int number = sc.nextInt();
        sc.close();
        int num1 = number * 1;
        int num2 = number * 2;
        int num3 = number * 3;
        int num4 = number * 4;
        int num5 = number * 5;
        int num6 = number * 6;
        int num7 = number * 7;
        int num8 = number * 8;
        int num9 = number * 9;
        int num10 = number * 10;
        System.out.println("The table of " + number + " is :");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println(num9);
        System.out.println(num10);

        

    }
}
