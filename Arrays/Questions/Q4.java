import java.util.Arrays;

//left Rotation of an array by one.
public class Q4 {

    public static int []leftRotate(int arr[], int n){

        int temp = arr[0];//Storing the first element in the temp variable.
        for(int i=1; i<n; i++){
           arr[i-1] = arr[i];//shifting the element by the left
        }
        arr[n-1] = temp;//at last we copy the temp variable to the last element.
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("Original Array: " +Arrays.toString(arr));
        leftRotate(arr, n);
        System.out.println("After Rotation by one: " +Arrays.toString(arr));

    }

}
