import java.util.Scanner;

public class StringQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.next();
        System.out.print("Enter your last name: ");
        String lastName = sc.next();
        sc.close();

        // Method 1
        System.out.println("Your full name is: " + firstName + " " + lastName);
        
        // Method 2
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // charAt
        for (int i = 0; i < fullName.length(); i++) { // Fixed the off-by-one error
            System.out.println(fullName.charAt(i));
        }
    }
}
