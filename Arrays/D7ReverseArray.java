package Arrays;
import java.util.*;

public class D7ReverseArray {

// Now we will reverse the array element within the same array which takes O(n)->Time COmplexity and O(1)-> Auxillary Space.

public static void rev(int arr[]){

    int F = 0;
    int L = arr.length-1;

    while (F<L)
    {
        int temp = arr[L];
        arr[L] = arr[F];
        arr[F] = temp;
        F++;
        L--;
    }

}

// //Function below used is completed by taking a new array then put the element from the original array
// //And fill it in reverse order in the new array.
//     public static int[] reverseA(int arr[]){

//         int nArr[] = new int[arr.length];


//         for (int i = 0; i<arr.length; i++){

//             nArr[i] = arr[arr.length-1];
//             arr[arr.length - 1]--;
//         }
//         return nArr;
//     }
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of an array");
        // int n = sc.nextInt();

        // int arr[] = new int[n];

        // System.out.println("Enter Array element");
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        int arr[] = {2, 4, 6, 8, 10};






        System.out.println("Original Array: " +Arrays.toString(arr) );
        System.out.println();
        // System.out.println("Reversed Array: "+Arrays.toString(reverseA(arr))); //Using new array thing

        rev(arr);

        System.out.println(Arrays.toString(arr));






    }
}
