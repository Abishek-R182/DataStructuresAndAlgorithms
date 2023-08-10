import java.util.Scanner;

public class BinarySearch {
    public static int binary(int a[], int k){
        int first = 0;
        int last = a.length - 1;
        while(first<=last){
            int mid =  (first + last )/2;
            if (a[mid] == k){
                return mid;
            }else if (a[mid] < k){
                first = mid + 1;
            }else{
                last = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int b[] = {4,16,23,32,45,59,64,77,85,90,99};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter:");
        int k = scanner.nextInt();
        int result = binary(b,k);

        if(result != -1){
            System.out.println("Element found at " + result);
        }else{
            System.out.println("Element not found");
        }
    }
}




