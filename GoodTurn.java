import java.util.Scanner;
        /*Chef and Chefina are playing with dice. In one turn, both of them roll their dice at once.
        They consider a turn to be good if the sum of the numbers on their dice is greater than 6.
        Given that in a particular turn Chef and Chefina got
        X and
        Y on their respective dice, find whether the turn was good.*/

public class GoodTurn {
    public static boolean isTurnGood(int x, int y) {
        int sum = x + y;
        return sum > 6;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter:");
        int a= s.nextInt();
        System.out.println("Enter:");
        int b= s.nextInt();

        if (isTurnGood(a, b)) {
            System.out.println("Good Turn!");
        } else {
            System.out.println("Not a Good Turn!");
        }


    }
}
