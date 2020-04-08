// Link -
class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroAt = 0;
        for(int i=0; i<nums.length;i++)
        {
            if(nums[i]!=0) 
            {
                int temp = nums[lastNonZeroAt];
                nums[lastNonZeroAt] =  nums[i];
                nums[i] = temp;
                lastNonZeroAt++;
            }
        }
    }
}