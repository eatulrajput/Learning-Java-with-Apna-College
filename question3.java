import java.util.*;

public class question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("The radius of the circle is :" + radius);
        sc.close();
        double perimeter = 2 * 3.14 * radius;
        System.out.println("The perimeter of the circle is :" + perimeter);
        double area = radius * radius * 3.14;
        System.out.println("The area of the circle is :" + area);

    }
}
