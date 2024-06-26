import java.util.ArrayList;
import java.util.Stack;

public class Basic {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Shoe");
        arr.add("Socks");
        arr.add("belt");
        arr.add("pant");

        System.out.println("ArrayList");
        for(String a : arr){
            System.out.println(a);
        }
        System.out.println("");

        Stack<String> stack = new Stack<>();
        System.out.println("Stack");
        for(String b : arr){
            stack.push(b);
        }
        System.out.println(stack);
    }
}
