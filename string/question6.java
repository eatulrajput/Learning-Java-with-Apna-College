// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.Scanner;
public class question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totalLength = 0;

        for(int i = 0; i < size; i++){
            array[i] = sc.next();
            totalLength += array[i].length();
        }

        sc.close();

        System.out.println(totalLength);
    }
}
