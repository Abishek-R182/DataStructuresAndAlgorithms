import java.util.Arrays;

public class Reversearray {
    public static void main(String[] args){
        int[] array = {1,3,5,6,7,8,9};
        System.out.println("Original Array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    public static void reverse(int[] array){
        int midlength = array.length - 1;
        int halflength = array.length/2;

        for(int i = 0; i<halflength; i++){
            int temp = array[i];
            array[i] = array[midlength - i];
            array[midlength - i] = temp;
        }
    }
}
