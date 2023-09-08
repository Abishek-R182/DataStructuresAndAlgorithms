import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n =  in.nextInt();

        for(int i = 0; i < n; i++){
            int number = 1;
            for(int j = 0; j < n - i ; j++){
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

