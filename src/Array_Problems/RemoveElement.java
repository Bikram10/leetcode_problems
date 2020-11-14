package Array_Problems;

public class RemoveElement {
    int[] nums = {0,1,2,2,3,0,4,2}; //5, nums = [0,1,4,0,3]
    int val = 2;
    RemoveElement(){
        System.out.println(removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val){
        int i=0;
        for(int j=1; j< nums.length; j++){
            if(nums[j] !=val)
                i++;
                nums[i] = nums[j];
        }
        return i+1;
    }

    public static void main(String[] args){
        new RemoveElement();
    }
}
