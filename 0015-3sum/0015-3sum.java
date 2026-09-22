class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res  = new ArrayList<>();
        int i=0 , j, k , sum = 0;
        for(i=0;i < nums.length;i++){
            if(i>0 && nums[i] == nums[i-1])
                continue;
            j = i+1;
            k = nums.length-1;
            while(j<k && k < nums.length){
                sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    List<Integer> cur = new ArrayList<>();
                    cur.add(nums[i]);
                    cur.add(nums[j]);
                    cur.add(nums[k]);
                    res.add(new ArrayList<>(cur));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1])  k--;
                }
                else if(sum > 0)
                    k--;
                else
                    j++;
            }
        }
        return res;
    }
}