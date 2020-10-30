//https://leetcode.com/problems/longest-continuous-increasing-subsequence/

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 0, res = 0;
        for(int i=0; i<nums.length; i++){
            if(i==0 || nums[i-1]<nums[i]){
                res = Math.max(res, ++count);   
            }else{
                count =1;
            }
        }
        return res;
    }
}

// May be easier to understand
class Solution {
    // tc -> n, sc-> 1
    public int findLengthOfLCIS(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        
        int maxLength = 1;
        
        int n = nums.length;
        
        int start = 0;
        for(int i=1; i<n; i++){
            if(nums[i-1] < nums[i]){
                maxLength = Math.max(maxLength, i-start+1);
            }
            
            else{
                start = i;
            }
        }
        
        return maxLength;
    }
}
