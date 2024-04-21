package Arrays;

import java.util.*;

//finding the largest number in a given array
public class D5LargestSmallest {

    //making a function to find the largest number among the array element.

    public static int getLargest(int []numbers){

        int largest = Integer.MIN_VALUE; // It signifies -infinity (It will help in comparing the numbers.)

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }



    //making a function to find the largest number among the array element.

    public static int getSmallest(int []numbers){

        int smallest = Integer.MAX_VALUE; // It signifies infinity (It will help in comparing the numbers.)

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {

        // Storing the element in an array
        int numbers[] = {2,5,4,3,6,8};

        System.out.println(Arrays.toString(numbers));

       int op =  getLargest(numbers);

        System.out.println("The largest number is: "+op);

        int op1 = getSmallest(numbers);
        System.out.println("The smallest number is: " +op1);


    }

}
