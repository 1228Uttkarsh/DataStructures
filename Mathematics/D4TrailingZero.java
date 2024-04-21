package Mathematics;
import java.util.*;

//Trailing zeros in factorial
public class D4TrailingZero {

/* Efficient approach:
The idea is to consider prime factors of a factorial n.
A trailing zero is always produced by prime factors 2 and 5.
Our task is done if we can count the number of 5s and 2s. Consider the following examples:

n = 5: There is one 5 and 3 2s in prime factors of 5! (2 * 2 * 2 * 3 * 5). So a count of trailing 0s is 1.


n = 11: There are two 5s and eight 2s in prime factors of 11! (2 8 * 34 * 52 * 7). So the count of trailing 0s is 2.
We can easily observe that the number of 2s in prime factors is always more than or equal to the number of 5s. So if we count 5s in prime factors, we are done.

Following is the summarized formula for counting trailing 0s:

Trailing 0s in n! = Count of 5s in prime factors of n! = floor(n/5) + floor(n/25) + floor(n/125) + ....

5^k = n
k is power of 5 in which the number lies
so 5^k = n
k = log5(n)base is 5.

 */

 //Time complexity is theta(log(n))
public static int trailingZero(int a){
    int count = 0;

    for(int i =5; i<=a; i*=5){
        count = count + (a/i);
    }
    return count;
}

//Below code is iterative approach
/*
    public static int trailingZero(int a){

        //Computing Factorial of a number.
        int fact =1;
        for(int i=2; i<=a; i++){
            fact=fact*i;
        }
        System.out.println("Factorial: "+fact);

//Counting the number of trailing zero.
        int count = 0;
        while (fact%10 == 0)
        {
            count++;
            fact= fact/10;

        }
        return count;

    }
*/
    public static void main(String[] args) {
        int num = 251;
        System.out.println("Number of trailing zero: "+trailingZero(num));

    }
}
