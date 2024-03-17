public class MaximumAverageSubArray {
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0, avgSum =0;
        int start=0;

        // for loop from  0 to length of nums and it stores values in sum
        for(int end=0; end<nums.length; end++){
            sum = sum + nums[end];

            // if the end in the loop greater than or equal to k-1 it run below
            // else it stores the value upto index k-1
            if(end>=k-1){
                //it stores which variable has highest value
                avgSum = Math.max(avgSum, sum);
                //removes the start of the element in array
                sum -= nums[start];
                start++;
            }
        }
        
        return (double) avgSum/k;
    }

    public static void main(String[] args){
        int num[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(num,k));
    }
}
