package Array_Problems;

public class SearchInsertPosition {
    int[] nums = {1,3,5,6}; //output = 1
    int target = 2;

    SearchInsertPosition(){
        System.out.println(searchInsertPosition(nums, target));
    }

    public int searchInsertPosition(int[] nums, int target){
        int i=0;
        int l = nums.length - 1;

        while(i <= l ){
            int j = (i+l) / 2;

            if ( target > nums[j]){
                i=j+1;
            }
            else if (target < nums[j]){
                l=j-1;
            }
            else {
                return j;
            }

        }

        return i;
    }

    public static void main(String[] args){
        new SearchInsertPosition();
    }
}
