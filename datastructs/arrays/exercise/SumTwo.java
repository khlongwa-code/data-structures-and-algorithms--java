package datastructs.arrays.exercise;

public class SumTwo {

    public static int[] sumTwo(int[] array, int target) {
        /*this method finds the indices of elements that if added equals target */
        
        int sum = 0;
        int[] indices = new int[2];
        boolean found = false;

        for (int i = 0; i < array.length - 1 && !found; i++) {
            sum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                sum += array[j];
                if (sum == target) {
                    indices[0] = i;
                    indices[1] = j;
                    found = true;
                    break;
                } else {
                    sum -= array[j];
                }
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = sumTwo(array, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

