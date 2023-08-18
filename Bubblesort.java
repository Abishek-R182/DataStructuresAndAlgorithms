import java.util.Arrays;

public class Bubblesort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
       public static void main(String[] args){
            int[] arr = {23, 32, 10, 45, 12};
            System.out.println("Original Array" + Arrays.toString(arr));

            bubbleSort(arr);

            System.out.println("Sorted Array" + Arrays.toString(arr));
    }
}
