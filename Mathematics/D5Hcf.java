package Mathematics;
import java.util.*;

/* In this problem we will find the HCF of two nuber.
 * HCF means highest number which will divide both the numbers.
 * ex- 4,6 -> HCF is 2. factor of 4 is 2,2. and 6 is 2,3.
 * Steps
 * min of a and b may be a hcf of the two number. ex 100,200 100is the hcf coz 100 divide the both.
 * if not divide then the number less than the min of two no which will divide both is the hcf
 */
public class D5Hcf {

    //Euclidean algorithm will be the standard to solve this.
    /* In this approach, instead of repeatedly subtracting the numbers till both become equal
     we can check if one number is a factor of the other.
Example:

Input: a = 42, b = 56:
Since b > a, we check if b%a=0. Since the answer is no, we proceed further.


*/
//Time complexity is O(log(min(a,b)))
public static int gcd(int a, int b){
    while (a!=b) {
        if(b == 0){
            return a;
        }else{
            return gcd(b, a%b);//gcd(56,42%56)->gcd(56,42)-->gcd(42,14)-->gcd(14,0)
        }

    }
    return -1;
}

    /* // This is naieve approach
    public static int hcfOfTwoNum(int a, int b){
        int res = Math.min(a, b);//first chk the minimum of a,b

        while(res>0){
            if(a % res == 0 && b % res == 0){
                break;
            }
            res--;

        }

    return res;
    } */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter The Value To Find HCF");
        int a = inp.nextInt();
        int b = inp.nextInt();
        //System.out.println("HCF of "+a+ " and "+b+ " is: "+hcfOfTwoNum(a, b));
        System.out.println("HCF of "+a+ " and "+b+ " is: "+gcd(a, b));


    }
}
