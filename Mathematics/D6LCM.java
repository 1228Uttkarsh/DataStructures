package Mathematics;
import java.util.*;

/* LCM is the lowest common factor. Smallest no. which is divisible by both
 * LCM would be greater than or equal to larger of two element.
 * Efficient Solution
 * Multiplication of two number is multiplication of gcd and lcm
 *  (a * b) = gcd(a,b) * lcm(a,b)
 * lcm(a,b) = (a*b)/gcd(a,b)
  */

public class D6LCM {
    public static int gcd(int a, int b){
        while(a!=b){
            if(b==0){
                return a;
            }else
            {
                return gcd(b,a%b);
            }
        }
        return -1;
    }
    public static int lcm(int a, int b){

        int lcm = (a*b)/gcd(a, b);
        return lcm;

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter The Value To Find LCM");
        int a = inp.nextInt();
        int b = inp.nextInt();
        System.out.println("LCM of "+a+ " and "+b+ " is: "+lcm(a, b));
    }

}
