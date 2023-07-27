import java.util.Scanner;

public class PuzzleHuntEligiblity {
    public static boolean isEligible(int N){
        return 6>=N && N<=8;
    }
    public static void main(String[] args){
        int N;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter: ");
        N = s.nextInt();

        if(isEligible(N)){
            System.out.println("Chef and his team is eligible to participate in puzzle");
        }
        else{
            System.out.println("Chef and his team is not eligible to participate in puzzle");
        }


    }

}
