import java.util.Scanner;

public class SearchMatrix {

        public static int searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return -1;
            }

            int m = matrix.length;
            int n = matrix[0].length;
            int left = 0;
            int right = m * n - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                int midValue = matrix[mid / n][mid % n];

                if (midValue == target) {
                    return midValue;
                } else if (midValue < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {1,3,5,7},
                    {10,11,16,20},
                    {23,30,34,60}
            };
            System.out.println("Enter: ");
            Scanner in = new Scanner(System.in);

            int target = in.nextInt() ;
            int result = searchMatrix(matrix, target);
             if(result!=-1){
                 System.out.println(result + " Element found");
             }else{
                 System.out.println("Element not found");
             }

        }
    }


