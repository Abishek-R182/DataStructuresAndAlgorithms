import java.util.Scanner;

public class Subtract {
    public static void main(String[] args){
        int n;
        int product=1;
        int sum=0;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter:");
        n=a.nextInt();

        while(n!=0){
            int y = n % 10;
            product *= y;
            sum += y;
            n/=10;
        }
        System.out.println(product);
        System.out.println(sum);

        int result = product - sum;
        System.out.println(result);
    }
}
