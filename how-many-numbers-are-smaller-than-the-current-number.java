// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
class how-many-numbers-are-smaller-than-the-current-number {
    // tc -> n^2, sc-> n
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
    
    // tc -> n, sc-> 1
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] count = new int[101];
        //int[] res = new int[n];
        
        for(int i=0; i<n; i++)
            count[nums[i]]++;
        
        for(int i=1; i<=100; i++)
            count[i] += count[i-1];
        
        for(int i=0; i<n; i++)            
            nums[i] = nums[i]> 0 
            ? count[nums[i]-1]
            : 0;
        
        return nums;
    }
}
