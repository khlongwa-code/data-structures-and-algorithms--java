package datastructs.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Arrayz {
    public int[] numbers;
    public int[] copyArray;
    public Scanner scan;
    public int sum;

    public Arrayz() {
        this.numbers = new int[5];
        this.copyArray = new int[5];
        this.scan = new Scanner(System.in);
        this.sum = 0;
    }

    public void populateArray() {
        for (int i = 0; i < numbers.length; i++) {
            int index = i + 1;
            System.out.println("Enter element: " + index);
            numbers[i] = Integer.parseInt(scan.nextLine());
        }
    }

    public void printArrayElements() {
        System.out.println("Array elements: ");
        for (int number : numbers) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }

    public void makeArrayCopy() {
        System.arraycopy(numbers, 0, copyArray, 0, numbers.length);
    }

    public void printCopiedArray() {
        System.out.println("Copy of numbers array: ");
        for (int number: copyArray) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }

    public void reverseArray(int[] arr) {
        int i, temp;

        System.out.println("Original array: ");
        for (Integer number : arr) {
            System.out.printf("%d ", number);
        }
        System.out.println();

        for (i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println("Reversed array: ");
        for (Integer number : arr) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }
    public int sumArrayElements() {
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int maxOfNumbers(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static void sortMyArray() {
        int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        System.out.println("Original array: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Arrayz array = new Arrayz();
        array.populateArray();
        array.makeArrayCopy();
        array.printArrayElements();
        array.printCopiedArray();
        int[] myArray = new int[]{7, 2, 3, 5};
        System.out.println("Max element of myArray: " + maxOfNumbers(myArray));
        array.reverseArray(myArray);
        int sum = array.sumArrayElements();

        System.out.println("The sum array numbers is " + sum);
        sortMyArray();

    }
}