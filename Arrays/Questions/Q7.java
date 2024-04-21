package Arrays.Questions;

import java.net.Socket;

/* Maximum difference of arr[j] - arr[i] where i<j. */



public class Q7 {

    public static int maxDiff(int arr[],int n){

       /* // Naive Approach O(n^2)
         int diff=0;
        int maxd=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                diff=arr[j]-arr[i];
                // if(diff>maxd){
                //     maxd=diff;
                // }
                maxd = Math.max(maxd, diff);
            }
        }
        return maxd; */


        //2nd mehod O(n)
        int res = arr[1] - arr[0], minval = arr[0];
        for(int j=1; j<n; j++){
            res = Math.max(res, arr[j] - minval);
            minval = Math.min(minval, arr[j]);
        }
        return res;

        }
    public static void main(String[] args) {
        int arr[] = {30, 10,8,2};
        int n = arr.length;
        System.out.println(maxDiff(arr,n));
       
    }
}
