package algorithms.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void instertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            /* this loop shift elements greater than temp to the right 
            to make space for inserting an element in it's correct position*/
            
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{13, 2, 5, 17, 0, 3};
        instertionSort(arr);

        System.out.println("Sorted arrar: " + Arrays.toString(arr));
    }
}
