/*
* Input a string from the user. Create a new string called ‘result’ in which you  will replace the letter ‘e’ in the original string with letter ‘i’. 
* Example : 
* original = “eabcdef’ ; result = “iabcdif”
* Original = “xyz” ; result = “xyz”
*/
import java.util.Scanner;
public class question7 {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    String result = "";

    for(int i = 0; i < input.length(); i++){
        if (input.charAt(i) == 'e') {
            result += 'i';
        } else {
            result += input.charAt(i);
        }
    }

    sc.close();

    System.out.println(result);
   }
}
