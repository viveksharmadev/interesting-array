// https://leetcode.com/problems/check-array-formation-through-concatenation/
class Solution {
    // tc -> m(pieces)*n(arr), sc-> 1
    public boolean canFormArray(int[] arr, int[][] pieces) {
        
        for(int[] piece : pieces){
            
            int j = 0;
            
            for(int num : arr){
                
                if(j < piece.length && num==piece[j]){
                    j++;
                }
            }
            
            if(j!=piece.length) return false;
        }
        
        return true;
    }
}
