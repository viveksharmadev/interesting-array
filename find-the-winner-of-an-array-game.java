// https://leetcode.com/problems/find-the-winner-of-an-array-game/
class find-the-winner-of-an-array-game {
    // tc -> n, sc-> 1
    public int getWinner(int[] arr, int k) {
        int curr = arr[0], winCount = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > curr){
                curr = arr[i];
                winCount = 0;
            }
            if(++winCount == k) break; 
        }
        return curr;
    }
}
