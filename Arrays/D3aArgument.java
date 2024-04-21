package Arrays;
import java.util.*;
//Passing Arrays as arguments
// Array jo hai by reference category ka chiz hai jb hm fun. argument daalte hai
/* lets assume marks is worngly given by a teacher, they had given 1 less marks in each so we have to update it
 * this programe will show how the array is passed by reference.
 */

public class D3aArgument {

    //creating update function.

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){

            marks[i] = marks[i] +1;
        }
    }
    public static void main(String[] args) {

        int marks[] = {89,78,95};

        update(marks);

        System.out.println(Arrays.toString(marks));

    }
}
