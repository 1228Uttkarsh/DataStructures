package Arrays;
import java.util.*;
//here we use prefix sum method to calculate the max sub array sum

//Time complexity is O(n^2)
public class D11MaxSubASum2 {
    public static void SubArrayPrefixSum(int arr[], int n){

        int currSum = 0;
        int max = Integer.MIN_VALUE;

        //creating a new array prefixSum
        int[] prefixSum = new int[n];
        //calculating the prefix sum array
        prefixSum[0] = arr[0];
        for(int i=1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int end = j;
                 currSum = start==0 ? prefixSum[end] : prefixSum[end] - prefixSum[start-1];
                if(currSum>max){
                    max = currSum;
                }
            }
        }
        System.out.println("The maximum sum of SubArray is:" +max);

    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        int n = arr.length;
        SubArrayPrefixSum(arr, n);
    }

}
