package algorithms.sort;

import java.util.Arrays;

public class SlectionSort {

    /*this algorith has time complexity O (n^2)
     * it does not work well with huge datasets but quite fine for small ones
     * 
     * first it checks if the current element is greater than the next element
     * 
     * if true the index of the next element is min index where an element smaller tha current is
     * 
     * then swipe the two elements
     */

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            swap(arr, i, min);
        }
    }
    public static void main(String[] args) {
        
        int[] arr = new int[]{3, 0, 1, 17, 4, 7, 2};
        selectionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
