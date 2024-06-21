package algorithms.search;

public class BinarySearch {
    private static int binarySearch(int[] arr, int target) {
        
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

    private static int recursiveBinarySearch(int[] arr, int highIndex, int lowIndex, int target) {
        if (highIndex >= lowIndex) {
            int mid = (lowIndex + highIndex) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                return recursiveBinarySearch(arr, highIndex, mid + 1, target);
            }
            return recursiveBinarySearch(arr, mid - 1, lowIndex, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 15;

        int targetIndex = binarySearch(arr, target);
        int targetIndexRecursed = recursiveBinarySearch(arr, arr.length - 1, 0, target);

        if (targetIndexRecursed != -1) {
            System.out.println("Target found by recursion at index " + targetIndexRecursed);
        } else {
            System.out.println("Target not found!");
        }

        if (targetIndex != -1) {
            System.out.println("Target found at index " + targetIndex);
        } else {
            System.out.println("Target not found!");
        }
    }
}
