import java.util.*;

//Left rotate an array by D places.

public class Q5 {
    public static void lRotate(int arr[], int n, int D) {

        int temp[] = new int[D];// creating an array of size d.
        // copying the array elemnt of size d in the temp variable.

        for (int i = 0; i < D; i++) {
            temp[i] = arr[i];
        }
        // shifting the remaining array element to its position.
        for (int i = D; i < n; i++) {
            arr[i - D] = arr[i];
        }

        // now placing the temp elemnts to the arr.
        for (int i = 0; i < D; i++) {
            arr[n - D + i] = temp[i];
        }

    }

    public static void

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int D = 3;
        lRotate(arr, n, D);

        System.out.println(Arrays.toString(arr));
    }

}
