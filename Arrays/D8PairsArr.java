package Arrays;
import java.util.*;

/* Here in this code we will print the pairs of all possible array element */


public class D8PairsArr {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int tp = 0; //To check how many possible pairs can be formed.

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+", "+arr[j]+")" +" " );
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total numbers of possible pair is: " +tp);
    }
}
/* In the above code to find out the total pairs we use formula n(n-1)/2 to calculate  */