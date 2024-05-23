import java.util.*;

// Class declaration
public class Question3 {
    // Main method
    public static void main(String[] args){
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompting for input
        System.out.println("Enter the radius of the circle: ");
        
        // Reading radius of the circle
        double radius = sc.nextDouble();
        
        // Displaying radius
        System.out.println("The radius of the circle is :" + radius);
        
        // Closing scanner
        sc.close();
        
        // Calculating perimeter of the circle
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of the circle is :" + perimeter);
        
        // Calculating area of the circle
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is :" + area);
    }
}
