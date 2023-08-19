import java.util.Arrays;

public class Inserttionsort {
    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i = 1 ; i < n ; i++){
            int k = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > k){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = k;
        }
    }

    public static void main(String[] args){
        int[] a = {4,3,2,10,1,12,5,6};
        System.out.println("Original Array" + Arrays.toString(a));

        insertionSort(a);

        System.out.println("Sorted Array" + Arrays.toString(a));
    }
}
