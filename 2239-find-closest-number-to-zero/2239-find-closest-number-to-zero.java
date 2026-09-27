class Solution {
    public int findClosestNumber(int[] nums) {
        int dist , val , cur; 
        dist = Integer.MAX_VALUE;
        val = nums[0];
        for(int i = 0 ; i<nums.length ; i++){
            cur = Math.abs(0-nums[i]);
            if(cur < dist){
                dist = cur;
                val = nums[i];
            }
            else if(cur == dist)
                val = nums[i]>val ? nums[i] : val;
        }
        return val;
    }
}