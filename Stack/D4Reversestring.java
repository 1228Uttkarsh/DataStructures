package Stack;
//Reverse a string using stack.

import java.util.*;


public class D4Reversestring {

    //Creating a function to store all character of string into a stack.

    public static String reverseString(String str){

        Stack<Character> s = new Stack<>();

        int idx = 0;

        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        //String builder is used to store the poped char.
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){

            char curr = s.pop();
            result.append(curr);

        }
        return result.toString();
    }
    public static void main(String[] args) {

        String str = "abc";

        String ans = reverseString(str);
        System.out.println(ans);
        
    }
}
