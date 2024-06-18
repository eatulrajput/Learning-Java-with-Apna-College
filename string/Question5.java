// String are immutable, then can't be modified after creation!
public class question5 {
    public static void main(String[] args){
        // Compare
        String sentence = "My name is Tony";
        // substring(beg index, end index)
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);

        String fullName = "TonyStark";
        // substring(beg index, end index)
        String firstName = fullName.substring(0, 4);
        System.out.println(firstName);
        String lastName = fullName.substring(4, 9);
        System.out.println(lastName);
        String lName = fullName.substring(4);
        System.out.println(lName);
    }
}
