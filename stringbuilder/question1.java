public class question1 {

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // Character at index 0
        System.out.println(sb.charAt(0));
        // Displays T
    
        // Set Character at index 
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        // Displays Pony

        // Insert Character at index 
        sb.insert(0, 'S');
        System.out.println(sb);
        // Displays SPony

        // Insert Character at index 
        sb.setCharAt(1, 'T');
        sb.insert(3, 'n');
        System.out.println(sb);
        // Displays STonny


        // Delete
        sb.delete(0, 2);
        System.out.println(sb);
    }
}