package Arrays;

public class D6BinarySearch {

    public static int binarySearch(int number[], int key,int n){

        int start = 0;
        int end = n-1;

        while (start<=end) {

            int mid = (start+end)/2;

            if(number[mid] == key){
                return mid;

            }
            if(number[mid] < key){//right

                start = mid+1;
            }else{//left
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        int number[] = {2,4,6,8,9,11,24,43};

        int n = number.length;

        int key = 11;
        System.out.println("index for key is: "+binarySearch(number, key, n));
    }


}
