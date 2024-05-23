import java.util.Scanner;

public class question24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        input.close();
       
       //upper part
       for(int i=1; i<=n; i++) {
        for(int j=1; j<=i; j++) {
            System.out.print(" * ");
        }


        int spaces = 2 * (n-i);
        for(int j=1; j<=spaces; j++) {
            System.out.print("   ");
        }


        for(int j=1; j<=i; j++) {
            System.out.print(" * ");
        }
        System.out.println();
    }

     //lower part
     for(int i=n; i>=1; i--) {
        for(int j=1; j<=i; j++) {
            System.out.print(" * ");
        }


        int spaces = 2 * (n-i);
        for(int j=1; j<=spaces; j++) {
            System.out.print("   ");
        }


        for(int j=1; j<=i; j++) {
            System.out.print(" * ");
        }
        System.out.println();
    }


    }
}