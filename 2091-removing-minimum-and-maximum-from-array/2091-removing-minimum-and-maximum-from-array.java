class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length <=2)
            return nums.length;
        int min , max ;
        min = max = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[min]>nums[i])
                min = i;
            if(nums[max]<nums[i])
                max = i;
        }
        int l , r , minSteps;
        l = Math.min(min,max);
        r = Math.max(min,max);

        minSteps = Math.min((l+1)+(nums.length-r),r+1);
        minSteps = Math.min(nums.length-l , minSteps);
        return minSteps;
    }
}