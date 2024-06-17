import java.util.Scanner;
public class question2 {
    /* Concatenation means to join to strings like first name and last name */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.next();
        System.out.print("Enter your last name: ");
        String lastName = sc.next();
        sc.close();
        // Method 1
        System.out.println("Your full name is: " + firstName + " " + lastName);
        // Method 2
        String fullName = firstName + " " +  lastName;
        System.out.println(fullName);
        // How to find the length of the string, using String.length()
        System.out.println(firstName.length());
        System.out.println(lastName.length());
        System.out.println(fullName.length());
        System.out.println(fullName.length() - (firstName.length() + lastName.length()));
    }
}
