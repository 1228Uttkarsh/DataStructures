package Arrays;


//Kadane's Algorithm for maxsubarray sum,
/* 1. Take two variable Current Sum(CS), Maximum Sum(MS).
 * 2. Take one loop to traverse each element of array and add
 * 3. Sum the element and update CS till the sum is positive, If it will  negative update current sum as zero
 * 4. Keep updatating MS and at last we will get max sub array sum.
 * Time complexity is O(n);
 * Auxillary space is O(n);
 */
public class D12KadanesMaxSub {

    public static void maxSubarraySum(int arr[], int n){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){

            cs += arr[i];

            if(cs<0){
                cs=0;
            }

            ms = Math.max(cs,ms);

            // if(cs>ms){
            //     ms = cs;
            // }

        }
         System.out.println("Maximum Subarray sum is: "+ms);

    }
    public static void main(String[] args) {
        int []arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;

    maxSubarraySum(arr, n);



    }

}
