package Arrays;

/* Here we will write a code for calculating maximum sub array sum of an array element.
 * But this code is brute force and the time complexity is O(n^3). SO we not preferbly use it.
*/

public class D10MaxSubASum {
    public static void maxSubArraySum(int arr[], int n){
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                currSum = 0; // for new sub array we have to make curr sum zero
                int end = j;
                for(int k=start; k<=end; k++){
                    currSum += arr[k];
                }
                if(currSum > max){
                    max = currSum;
                }
            }
        }
        System.out.println("Maximum sum: "+max);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        int n = arr.length;
        maxSubArraySum(arr, n);
    }
}
