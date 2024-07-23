public class StringQ4 {
    public static void main(String[] args){
        // compare
        String name1 = "Tony";
        String name2 = "Tony";


        if (name1 == name2) {
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }

/*
 * CompareTo checks three cases of string:
 * 1. check string 1 > string 2 :: return +ve value
 * 2. check string 1 == string 2 :: return 0
 * 3. check string 1 < string 2 :: return -ve value
 */

 // Why we used CompareTo function? It is because " == " gets failed in many test cases.

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }


// Here it will print NOT equal because:
// In Java, strings are objects their functions are different from variable String!

        if (new String("Tony") == new String("Tony")) {
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are NOT equal");
        }
    }

}
