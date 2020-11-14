package Array_Problems;

public class RemoveDuplicates {
    int[] nums = {1,1,2}; //Output = 2, nums[1, 2]


    RemoveDuplicates(){
        System.out.println(removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums){
        int i=0;

        for(int j=1; j<nums.length; j++){
            if(nums[i] !=nums[j])
                i++;
                nums[i] = nums[j];
        }

        return i+1;
    }

    public static void main(String[] args){
        new RemoveDuplicates();
    }
}
