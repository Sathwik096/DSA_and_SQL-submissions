class Solution {
    private static void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    static void add(int i,int[] nums,Set<List<Integer>> ans){
        if(i == nums.length){
            List<Integer> arr = new ArrayList<>();
            for(int ind : nums)
                arr.add(ind);
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int ind = i ; ind < nums.length; ind++){
            if(ind > i && nums[ind] == nums[ind-1])
                continue;
            swap(ind,i,nums);
            add(i+1,nums,ans);
            swap(ind,i,nums);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        add(0,nums,ans);
        return new ArrayList<>(ans);
    }
}