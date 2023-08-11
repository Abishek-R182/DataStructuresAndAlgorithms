import java.util.Scanner;

public class Linearsearch {
    public static int linearSearch(int a[], int target){
        for(int i = 0; i < a.length; i++ ){
            if(a[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] number = {3,15,27,32,47,58,64,79,89,99};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter:");
        int target = scanner.nextInt();

        int result = linearSearch(number, target);

        if(target != -1){
            System.out.println("Element found at " + result);
        }else{
            System.out.println("Element Not found");
        }
    }

}
