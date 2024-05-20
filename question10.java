import java.util.*;
public class question10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 0 or 1");
    System.out.println("0 for Stop");
    System.out.println("1 for Continue");
    int n = sc.nextInt();
    switch (n) {
        case 1: {
            System.out.println("Enter the marks of the student");
            int marks = sc.nextInt();
            sc.close();
            if (marks>=90) {
                System.out.println("This is good");
            } else if(marks>=60){
                System.out.println("This is also good");
            } else{
                System.out.println("This is good as well");
            }
        };
            
            break;
            case 0: System.out.println("No operation is applied!");
            
            break;
        default: System.out.println("Enter 0 or 1 please!");
            break;
    }

    }

}
