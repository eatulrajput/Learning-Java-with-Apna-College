import java.util.*;
public class evenorodd {
    public static void main(String[] args){
        System.out.println("Enter a number please!");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        if(number % 2 == 0){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is an odd number");
        }

    }
}
