public class EligiblityTest {
    public static boolean isEligible(int a, int x, int y) {
        return a >= x && a < y;
    }
    public static void main(String[] args) {

        int a = 25;
        int x= 18;
        int y = 35;

        if (isEligible(a, x, y)) {
            System.out.println("Chef is eligible to take the exam!");
        }
        else {
            System.out.println("Chef is not eligible to take the exam!");
        }
    }
}