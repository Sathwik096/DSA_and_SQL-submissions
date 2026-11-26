class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] res=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[i]=nums[(i+nums[i])%n];
            }
            else if(nums[i]<0){
                int ind = Math.abs(nums[i])%n;
                res[i] = i >= ind ? nums[i - ind] : nums[n - ind + i];
            }
            else
                res[i]=nums[i];
        }
        return res;
    }
}