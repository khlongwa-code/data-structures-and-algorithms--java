package algorithms.sort;

import java.util.Arrays;

public class BubbleSort {
    /*
     * this sorting algorithm has time complexity O (n^2)
     * it is a bit fine to work with for small data sets but extremely terrible for big datasets
     * 
     * it continuously swap the adjacent elements until the entire array is sorted
     * 
     * example - arr{3,1,0,2}
     * first outer loop run swap 3, 1 -> {1, 3, 0, 2}, swap 3, 0 -> {1, 0, 3, 2}, swap 3, 2 -> {1, 0, 2, 3}
     * second outer loop run swap 1, 0 - > {0, 1, 2, 3} -> after this swap the current > next is false 
     * and all the iterations are in vein
     */
    public static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }

    public static void bubbleSort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{16, 2, 7, 0, 13};
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
