package datastructs.arrays.exercise;

public class QuickSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static int partition(int[] arr, int lowIndex, int highIndex) {
        int pivot = arr[highIndex];

        int i = (lowIndex - 1);

        for (int j = lowIndex; j <= highIndex - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, highIndex);

        return i + 1;
    }

    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int partitionIndex = partition(arr, lowIndex, highIndex);
            quickSort(arr, lowIndex, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, highIndex);
        }
    }

    public static void displaySortedArray(int[] arr) {
        for (int element: arr) {
            System.out.print(element + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 7, 9, 12, 11, 3, 5};
        int arrayLength = arr.length;

        quickSort(arr, 0, arrayLength - 1);

        displaySortedArray(arr);
    }
}
