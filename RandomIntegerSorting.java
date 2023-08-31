import java.util.Scanner;

public class RandomIntegerSorting {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[] a = getIntegers(5);
        int[] sorted = sortInteger(a);
        printArray(sorted);

    }
    public static int[] getIntegers(int number){

        System.out.println("Enter: " + number);
        int[] array= new int[number];
        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println("Elements " + i + " content of " + array[i]);
        }
    }

    public static int[] sortInteger(int[] arr){
        int n = arr.length;

        boolean flag;


        flag = false;
        for(int j = 0 ; j<n-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag = true;
            }

        }
        return arr;
    }

}
