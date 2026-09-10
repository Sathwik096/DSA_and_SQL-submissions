class Solution {
    static void add(int[] nums,List<List<Integer>> ans,List<Integer> cur,HashSet<Integer> set){
        if(cur.size() == nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int ind = 0 ; ind < nums.length; ind++){
            if(!set.contains(ind)){
                set.add(ind);
                cur.add(nums[ind]);
                add(nums,ans,cur,set);
                cur.remove(cur.size()-1);
                set.remove(ind);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        add(nums,ans,cur,set);
        return ans;
    }
}