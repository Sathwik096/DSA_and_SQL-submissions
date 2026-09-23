class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int i , j , k , l ;
        for(i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1])
                    continue;
            for(j=i+1;j<nums.length;j++){
                if(j>(i+1) && nums[j] == nums[j-1])
                    continue;
                k = j+1;
                l = nums.length-1;
                while(k<l){
                    long sum = nums[i] + nums[j];
                    sum += nums[k] + nums[l];
                    if(sum == target){
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[k]);
                        ans.add(nums[l]);
                        res.add(new ArrayList<>(ans));
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1])
                            k++;
                        while(l > k  && nums[l] == nums[i+1])
                            l--;
                    }
                    else if(sum > target)
                        l--;
                    else
                        k++;
                }
            }
        }
        return res;
    }
}