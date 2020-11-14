package Array_Problems;

public class TwoSum {
    int[] nums = {2,7,11,15}; // output[0, 1]
    int target = 9;
    TwoSum(){
        System.out.println(twoSum(nums, target));
    }

    public int[] twoSum(int[] nums, int target){

        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args){
        new TwoSum();
    }
}
