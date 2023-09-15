public class PrintDuplicates {
    // To print duplicates elements in array
    public static void duplicates(int[] a) {
        for (int i = 0; i < a.length ; i++) {
            for (int j = i + 1; j < a.length ; j++) {
                if (a[i] == a[j] && i != j) {
                    System.out.println("Duplicate Element: " + a[j]);
                }
            }
        }

    }
    public static void main(String args[]){
        int[] arr ={0,1,2,2,3,1,4,5,4,0};
        duplicates(arr);
    }
}
