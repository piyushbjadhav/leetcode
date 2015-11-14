class Solution {
    public static int[] twoSum(int[] nums, int target) {
        java.util.HashMap<Integer,Integer> inverse = new java.util.HashMap<Integer,Integer>();
        int[] ret = new int[2];
        for(int i=0;i<nums.length;i++)
            inverse.put(target-nums[i],i);
        for(int i=0;i<nums.length;i++)
            if(inverse.containsKey(nums[i]) && inverse.get(nums[i])!=i ){
                ret[0] = i+1;
                ret[1] = inverse.get(nums[i])+1;
                break;
            }
        return ret;
    }
}