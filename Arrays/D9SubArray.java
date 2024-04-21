package Arrays;


 /* A continuous part of array is called subarray.
  * eg: arr = 2,4,5,6,7,8
  Subarray can be : (2,4,5),(2,4), (2,4,5,6)
  not subarray: (2,4,6), (2,5,6)
 */
public class D9SubArray {
    public static void subArray(int arr[], int n){
        int tsub = 0;

        System.out.println("The SubArray of element is following:");

        for(int i =0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){

                    System.out.print(arr[k]+" ");

                }
                tsub++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subarray of given array: "+tsub);

    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int n = arr.length;
        subArray(arr, n);


    }
}
