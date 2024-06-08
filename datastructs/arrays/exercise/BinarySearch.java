package datastructs.arrays.exercise;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        
        int low = 0; //lowest index of an array
        int high = arr.length - 1; //highest index of an array

        while (low <= high) {
            int mid = (low + high) / 2; //calculates mid index of an array

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 15;

        int targetIndex = binarySearch(arr, target);

        if (targetIndex != -1) {
            System.out.println("Target found at index " + targetIndex);
        } else {
            System.out.println("Target not found!");
        }
    }
}
