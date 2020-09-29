/*
Pairs with Specific Difference
Given an array arr of distinct integers and a nonnegative integer k, write a function findPairsWithGivenDifference that returns an array of all pairs [x,y] in arr, such that x - y = k. If no such pairs exist, return an empty array.

Note: the order of the pairs in the output array should maintain the order of the y element in the original array.

Examples:

input:  arr = [0, -1, -2, 2, 1], k = 1
output: [[1, 0], [0, -1], [-1, -2], [2, 1]]

input:  arr = [1, 7, 5, 3, 32, 17, 12], k = 17
output: []
Constraints:

[time limit] 5000ms

[input] array.integer arr

0 ≤ arr.length ≤ 100
[input]integer k

k ≥ 0
[output] array.array.integer
*/
// https://leetcode.com/playground/bc2yAwyS
public class Main {
    public static int[][] findPairsWithGivenDifference(int[] arr, int k){
        List<int[]> result = new LinkedList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
          map.putIfAbsent(num-k, num); // num-k, y
        }

        for(int num : arr){
          if(map.containsKey(num)){
              result.add(new int[]{num+k, num});
          }
        }

        return result.toArray(new int[][]{});
    }
    
    public static void main(String[] args) {
        int[] testArr1 = new int[]{4,1}; int k1 = 3;
        int[] testArr2 = new int[]{1,5,11,7}; int k2 = 4;
        int[] testArr3 = new int[]{1,5,11,7}; int k3 = 6;
        int[] testArr4 = new int[]{1,5,11,7}; int k4 = 10;
        int[] testArr5 = new int[]{0,-1,-2,2,1}; int k5 = 1;
        int[] testArr6 = new int[]{1,7,5,3,32,17,12}; int k6 = 17;
        
        int[][] res1 = findPairsWithGivenDifference(testArr1, k1);
        int[][] res2 = findPairsWithGivenDifference(testArr2, k2);
        int[][] res3 = findPairsWithGivenDifference(testArr3, k3);
        int[][] res4 = findPairsWithGivenDifference(testArr4, k4);
        int[][] res5 = findPairsWithGivenDifference(testArr5, k5);
        int[][] res6 = findPairsWithGivenDifference(testArr6, k6);
        
        System.out.println(Arrays.deepToString(res1));
        System.out.println(Arrays.deepToString(res2));
        System.out.println(Arrays.deepToString(res3));
        System.out.println(Arrays.deepToString(res4));
        System.out.println(Arrays.deepToString(res5));
        System.out.println(Arrays.deepToString(res6));
    }
}
