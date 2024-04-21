package BitMagic;
import java.util.*;

//Count digit in the given input
/* lets digit = 7896, so how we will count the digit, we will divide the given integer by 10
 * in each iteration of division we will get the digit like this
 * 7896/10 = 789 coz it will return only integer value. so after each iteration we will count
 * the no. of iteration will give us the number of digit.
  */

public class D1CountDig {
    public static int countDigit(int num){

        if(num==0)
        return 1;

        int count = 0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;

    }
    public static void main(String[] args) {
        int num = 4;

        System.out.println("The number of digit in "+num+ " is: "+countDigit(num));


    }

}
