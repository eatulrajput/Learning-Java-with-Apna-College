public class question1 {
    public static void main(String[] args){
        // Declare and initialize an integer array 'marks' with size 3
        int[] marks = new int[3]; 

        // Assign marks for different subjects
        marks[0] = 97; // Physics Marks
        marks[1] = 98; // Chemistry Marks
        marks[2] = 95; // Maths Marks 
        
        // Print individual marks
        System.out.println("Displaying Marks");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // Print marks using a for loop
        System.out.println();
        System.out.println("Displaying Marks using for loop");
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}
