import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        int[] num = {1,2,3,4,5,6,7};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter: ");
        int k = scanner.nextInt();
        int n = num.length;
        k = k % n;
        rotate(num, 0, n-1);
        System.out.println("Reversed: " + Arrays.toString(num));
        rotate(num, 0, k-1);
        System.out.println("Reversed: " + Arrays.toString(num));
        rotate(num, k, n-1);
        System.out.println("Reversed: " + Arrays.toString(num));
    }

    public static void rotate(int[] nums, int start, int end) {
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
