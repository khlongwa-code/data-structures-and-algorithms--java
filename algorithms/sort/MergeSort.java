package algorithms.sort;
import java.util.Arrays;

public class MergeSort {
    
    private static void mergeSort(int[] arr) {
        int arrayLength = arr.length;
        if (arrayLength <= 1) {
            return;
        }

        int middle = arrayLength / 2;
        int[] leftSubArray = new int[middle];
        int[] rightSubArray = new int[arrayLength - middle];
        int j = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (i < middle) {
                leftSubArray[i] = arr[i];
            } else {
                rightSubArray[j] = arr[i];
                j++;
            }
        }
        mergeSort(leftSubArray);
        mergeSort(rightSubArray);
        merge(arr, leftSubArray, rightSubArray);
    }

    private static void merge(int[] arr, int[] leftSubArray, int[] rightSubArray) {
        int leftSubArrayLen = arr.length / 2;
        int rightSubArrayLen = arr.length - leftSubArrayLen;

        int i = 0, left = 0, right = 0;

        while(left < leftSubArrayLen && right < rightSubArrayLen) {
            if (leftSubArray[left] < rightSubArray[right]) {
                arr[i] = leftSubArray[left];
                i++;
                left++;
            } else {
                arr[i] = rightSubArray[right];
                i++;
                right++;
            }
        }

        while (left < leftSubArrayLen) {
            arr[i] = leftSubArray[left];
            i++;
            left++;
        }

        while (right < rightSubArrayLen) {
            arr[i] = rightSubArray[right];
            i++;
            right++;
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 5, 0, 1, 8, 7, 6, 9, 4};
        mergeSort(arr);
        System.out.println("Sorted array:\n" + Arrays.toString(arr));
    }
}
