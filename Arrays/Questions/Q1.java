package Arrays.Questions;
import java.util.*;

/*  Q1. Given an integer array nums, return true if any value appears at least twice in the
array, and return false if every element is distinct
Input: nums = [1, 2, 3, 1]
Output: true*/
public class Q1 {

    //btute force approach.

    // public static boolean duplicate(int[]nums, int n){

    //     for(int i=0; i<n; i++){
    //         for(int j=i+1; j<n; j++){

    //           if(nums[i] == nums[j]){
    //             return true;
    //         }
    //     }
    // }
    // return false;

    // }

    // Using HashSet

    public static boolean duplicate(int nums[]){

        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return true;
            }else{
                set.add(i);
            }

    }
    return false;
}

    public static void main(String[] args) {
        int []nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int n = nums.length;


       System.out.println( duplicate(nums));



    }

}
