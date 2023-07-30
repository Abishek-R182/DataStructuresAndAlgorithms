import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter:");
        int n = a.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println(fibo(i) + " ");
        }
    }
    public static int fibo(int n) {
        if(n<=1){
            return n;
        }else{
            return fibo(n-1) + fibo(n-2);
        }
    }
}
