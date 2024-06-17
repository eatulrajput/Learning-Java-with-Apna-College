import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name here: ");
        String name = sc.nextLine(); // to read a full name or multiple words

        System.out.println("Write about yourself here:");
        String sentence = sc.nextLine(); // to read a full sentence or multiple lines

        sc.close();

        System.out.println("Your name is: " + name);
        System.out.println("About yourself: " + sentence);
    }
}
