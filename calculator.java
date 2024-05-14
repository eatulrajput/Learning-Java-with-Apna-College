import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();
    
    System.out.println("Choose the operation you want to perform:");
    System.out.println("1 for Addition");
    System.out.println("2 for subtraction");
    System.out.println("3 for multiplication");
    System.out.println("4 for division");
    int sum = a + b;
    int sub = b - a;
    int mul = a * b;
    int div = a / b;
    int operation = sc.nextInt();
    sc.close();
    switch (operation) {
        case 1: System.out.println(sum);
            break;
        case 2: System.out.println(sub);
            break;
        case 3: System.out.println(mul);
            break;
        case 4: System.out.println(div);
            break;
    
        default: System.out.println("Wrong Option, choose again!");
            break;
    }
    }
    

}
