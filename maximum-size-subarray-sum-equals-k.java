// https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/
// tc -> n, sc-> n
class maximum-size-subarray-sum-equals-k {
    public int maxSubArrayLen(int[] nums, int k) {
        int sum=0, maxLen=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(sum==k){
                maxLen = i+1;
            }else if(map.containsKey(sum-k)){
                maxLen = Math.max(maxLen, i-map.get(sum-k));
            }
            if(!map.containsKey(sum)) map.put(sum, i);
        }
        return maxLen;
    }
}
