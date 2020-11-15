package Array_Problems;

public class MaximumSubArray {
    int[] nums = {-2,1,-3,4,-1,2,1,-5,4}; //Max sum: output 6

    int max_so_far = Integer.MIN_VALUE;
    int max = 0;

    MaximumSubArray(){
        System.out.println(maximumSubArray(nums));
    }

    public int maximumSubArray(int[] nums){
        for(int i=0; i< nums.length; i++){
            max = Math.max(nums[i], max + nums[i]);

            if(max > max_so_far){
                max_so_far = max;
            }

            if(max < 0){
                max = 0;
            }
        }

        return max_so_far;
    }

    public static void main(String[] args){
        new MaximumSubArray();
    }
}
