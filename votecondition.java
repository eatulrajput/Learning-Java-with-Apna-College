import java.util.*;
public class votecondition {
    public static void main(String[] args){
        System.out.println("Enter your age please!");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        if(age>18){
            System.out.println("You can vote now, you are considered as an adult now!");
        }
        else{
            System.out.println("You can't vote now, you are not an adult");
        }

    }
}
