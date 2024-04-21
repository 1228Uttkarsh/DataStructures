

import java.util.*;
//Move all zero to End.


public class Q3 {

    public static int []zeroToEnd(int []arr){

        int n = arr.length;

        //loop
       /*  for(int i=0; i<n; i++){
            if(arr[i] == 0){
                for(int j=i+1; j<n; j++){
                    if(arr[j]!=0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

            }
        }
        return arr; */

        //Efficient solution.
        /* Time complexity = O(n)
         * Auxillary space = O(1)
         * one Traversal Solution
         */
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i]!= 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        int arr[] = {8, 5, 0, 10, 0, 20};
        System.out.println("Original Array: "+Arrays.toString(arr));

        zeroToEnd(arr);
        System.out.println("Array after moving all zero's to end: "+Arrays.toString(arr));
    }

}
