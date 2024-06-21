import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int n = sc.nextInt();
        ArrayList<Integer> array1 = new ArrayList<>();
        for(int i=1; i<=n; i++){
            array1.add(i);
        }
        System.out.println("Original Array" + array1);

        Stack<Integer> stack = new Stack<>();
        for(int num : array1){
            stack.push(num);
        }
        System.out.println("Stack Array" + stack);

        ArrayList<Integer> array2 = new ArrayList<>();
        while(!stack.isEmpty()){
            array2.add(stack.pop());
        }
        System.out.println("Reversed Array" + array2);

    }
}
