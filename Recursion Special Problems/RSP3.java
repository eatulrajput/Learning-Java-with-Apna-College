/**
 * RSP3
 * Find the first and the last occurence of an element in the string. For example: "abaacdaefaah".
 */
public class RSP3 {

    public static int first = -1;
    public static int last = -1;
    
    public static void findOccurence(String str, int idx, char element){
        if (idx == str.length()) {
            System.out.println(first);
            System.err.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            }
            else{
                last = idx;
            }
        }

        findOccurence(str, idx + 1, element);
    }

    
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurence(str, 0, 'h');
    }
}