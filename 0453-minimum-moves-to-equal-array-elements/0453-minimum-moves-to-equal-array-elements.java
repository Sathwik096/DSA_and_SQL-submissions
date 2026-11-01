class Solution {
    public int minMoves(int[] nums) {
        if(nums.length == 1)
            return 0;
        int count = 0 , min = nums[0] , sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min)
                min = nums[i];
            sum += nums[i];
        }
        count = sum - (nums.length * min);
        return count;
    }
}