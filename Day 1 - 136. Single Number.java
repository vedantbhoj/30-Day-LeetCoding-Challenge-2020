// Link - 
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0; 
        for(int i: nums)
        {
            res ^= i;  // 2,2,1 // 0010 xor 0010 xor 0001 = 0001
        }
        return res;
    }
}