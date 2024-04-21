import java.util.*;

/*  N-th Fibonacci Number
You are given an integer ‘N’, your task is to find and return the N’th Fibonacci number using matrix exponentiation.
Since the answer can be very large, return the answer modulo 10^9 +7. */



public class Q8 {

    public static int fibonacci(int inp){

        if(inp <= 1){
            return inp;
        }
        return fibonacci(inp -1) + fibonacci(inp -2);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int inp = sc.nextInt();

        for(int i=0; i<inp; i++){
            System.out.print(fibonacci(i)+ " ");
        }

    }
}
