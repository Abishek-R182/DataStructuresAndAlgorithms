public class FindMissingNumber {
    public static int findNumber(int[] num){
        int n = num.length;
        int missing= n;
        for(int i = 0; i<n; i++){
            missing ^= i^num[i];
        }
        return missing;
    }

    public static void main(String[] args){
        int[] num = {9,2,3,5,0,1,7,6,4};
        int missingnumber = findNumber(num);
        System.out.println(missingnumber);
    }
}
