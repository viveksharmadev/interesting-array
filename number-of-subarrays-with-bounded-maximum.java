// https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/
class Solution {
    // tc -> n, sc-> 1
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int count = 0, res = 0, j = 0;
        
        for(int i=0; i<nums.length; i++){
            
            if(nums[i] >= left && nums[i] <= right){
                res += i-j+1; count = i-j+1;
            }
            
            else if(nums[i] < left){
                res += count; 
            }
            
            else{
                j = i+1;
                count = 0;
            }
        }
        
        return res;
    }
}
