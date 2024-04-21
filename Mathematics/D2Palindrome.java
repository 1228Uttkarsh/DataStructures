package BitMagic;


/* if the given number is same after reversing it then it is a palindrome number */

public class D2Palindrome {

    public static boolean palindrome(int num){
       int rev =0;
       int temp = num;
        while(temp!=0){
            int temp1 = temp%10;
            rev = rev*10 + temp1;
            temp = temp/10;

        }
        return (rev == num);



    }
    public static void main(String[] args) {
        int num = 78987;
        System.out.println(palindrome(num));
    }
}
