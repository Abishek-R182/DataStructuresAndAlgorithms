import java.util.Arrays;

public class RemoveDuplicatesfromArray {
    public static int[] removeDuplicates(int[] number){
        if (number == null || number.length == 0) {
            return new int[0];
        }

        int n = number.length;
        int Index = 0;

        for(int i = 0 ; i < n ; i++){
            if(number[i] != number[Index]){
                Index++;
                number[Index] = number[i];
            }
        }

        int[] result = new int[Index + 1];
        for (int i = 0; i <= Index; i++) {
            result[i] = number[i];
        }


        return result;
    }

    public static void main(String[] args){
        int[] sortedArray = {1, 1, 2, 2, 3, 4, 4, 4, 5, 5};
        int[] uniqueArray = removeDuplicates(sortedArray);
        System.out.println("Unique Array:");

        for (int num : uniqueArray) {
            System.out.print(num + " ");
    }

}
}
