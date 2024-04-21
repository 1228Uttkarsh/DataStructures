package BitMagic;

public class D3Factorial {
    public static int fact(int num){
        if(num==1|| num == 0){
            return 1;
        }
        int factorial = 1;
        for(int i=2; i<=num; i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int num = 25;
        System.out.println("Factorial of "+num+ " is: "+fact(num));
    }

}
