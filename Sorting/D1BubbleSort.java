package Sorting;

public class D1BubbleSort {
    // Bubble sort with optimised code which will give time comlexity by O(n) if
    // array is already sorted. other wise O(n).
    public static void bubbleSort(int[] arr, int n) {
        int count = 0;

        for (int turn = 0; turn < n - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < n - 1 - turn; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }

            if (swap == 0) {
                break;
            }
            count++;

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        bubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

// bubble sort code
/*
 * public static void bubbleSort(int[] arr, int n) {
 *
 *
 * for (int turn = 0; turn < n - 1; turn++) {
 *
 * for (int j = 0; j < n - 1 - turn; j++) {
 * if (arr[j + 1] < arr[j]) {
 * int temp = arr[j];
 * arr[j] = arr[j + 1];
 * arr[j + 1] = temp;
 *
 * }
 * }
 * }
 *
 * }
 */