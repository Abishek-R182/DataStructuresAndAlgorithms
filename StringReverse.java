public class StringReverse {
    public static void main(String[] args){
        String original = "Hello World";
        String reversed = reverseString(original);
        System.out.println(reversed);
    }
    public static String reverseString(String str){
        char[] a = str.toCharArray();
        int left = 0;
        int right = a.length - 1;

        while(left<=right){
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
        return new String(a);
    }
}
