package Arrays;
import java.util.*;

//Storing the elements in java by taking input from the users.
public class D2IOU {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in) ;

        int marks[] = new int[10];

        System.out.println("Enter marks: ");
        
        for(int i=0; i<marks.length; i++){

            marks[i] = inp.nextInt();            
        }

        
            System.out.println(Arrays.toString(marks));
        
    }
    
}
