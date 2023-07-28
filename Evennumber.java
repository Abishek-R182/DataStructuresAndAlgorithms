import java.util.ArrayList;
import java.util.List;

public class Evennumber {
    public static List<Integer> findEvenNumber(int[] num){
        List<Integer> a = new ArrayList<>();

        if(num ==null){
            //Return an empty list if the input array is null
            return a;
        }
        for (int i : num){
            if((i) % 2 ==0){
                a.add(i);
            }
        }
        return a;
    }
    public static void main(String[] args){
        int[] nums ={12,345,2,6,7896};  //Input Array
        List<Integer> a = findEvenNumber(nums);
        System.out.println("ever numbers are :" + a);
    }
}
