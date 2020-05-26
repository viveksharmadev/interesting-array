// https://leetcode.com/problems/contiguous-array/
class Solution {
    // tc -> n^2, sc-> 1
    public int findMaxLength(int[] nums) {
        int maxLen = 0;
        for(int i=0; i<nums.length; i++){
            int zeros = 0, ones = 0;
            for(int j=i; j<nums.length; j++){
                if(nums[j]==0){
                    zeros++;
                }else{
                    ones++;
                }
                if(zeros==ones){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }
    
    /* indexMap.put(0,-1), It means that, before we loop this array, 
the sum is 0 in initial, and because we haven't starting loop, 
so the index = -1.
Also for the arr [-1,1], when entering the loop, when i=1, sum=-1+1=0. 
the length is i-(-1) -> 1-(-1) = 2. so put(0,-1) is needed. 
*/
   // tc -> n, sc-> n
   public int findMaxLength(int[] nums) {
       for(int i=0; i<nums.length; i++){
           if(nums[i]==0) nums[i] = -1;
       }
       
       Map<Integer, Integer> indexMap = new HashMap<>();
       indexMap.put(0,-1);// To cover test case [1,0]
       
       int sum = 0, maxLen = 0;
       for(int i=0; i<nums.length; i++){
           sum += nums[i];
           if(indexMap.containsKey(sum)){
               maxLen = Math.max(maxLen, i-indexMap.get(sum));
           }else{
               indexMap.put(sum, i);
           }
       }
       return maxLen;
   }
}
