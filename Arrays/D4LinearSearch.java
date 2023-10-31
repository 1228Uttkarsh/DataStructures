package Arrays;
import java.util.*;


// Linear search using array.
public class D4LinearSearch{

    public static int linearSearchL(int arr[], int key){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;               
        }
    }
    return -1;
}
   

    public static void main(String[] args) {

        int key = 189;
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
       int index =  linearSearchL(arr, key);

        if(index == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key is at index:" +index);
        }
        
    }
}
