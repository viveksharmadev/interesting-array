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
