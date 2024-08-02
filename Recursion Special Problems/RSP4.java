/**
 * RSP4
 * Check if an array is sorted (Strictly increasing). For example: {1,2,3,4,5}
 */
public class RSP4 {

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