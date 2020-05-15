//https://leetcode.com/problems/maximum-sum-circular-subarray/
class Solution {
    // tc -> n, sc-> 1
    public int maxSubarraySumCircular(int[] A) {
        int total = 0, maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE, currMin = 0, currMax = 0;
        for(int a : A){
            currMax = Math.max(currMax+a, a);
            maxSum = Math.max(maxSum, currMax);
            currMin = Math.min(currMin+a, a);
            minSum = Math.min(minSum, currMin);
            total += a;
        }
        return maxSum>0 ? Math.max(maxSum, total-minSum) : maxSum;
    }
}
