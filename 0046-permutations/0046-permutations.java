class Solution {
    private static void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    static void add(int i,int[] nums,List<List<Integer>> ans){
        if(i == nums.length){
            List<Integer> arr = new ArrayList<>();
            for(int ind : nums)
                arr.add(ind);
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int ind = i ; ind < nums.length; ind++){
            swap(ind,i,nums);
            add(i+1,nums,ans);
            swap(ind,i,nums);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        add(0,nums,ans);
        return ans;
    }
}