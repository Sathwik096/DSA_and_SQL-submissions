class Solution {
    static void subsets(int[] nums,int i,List<List<Integer>> set,List<Integer> list){
            set.add(new ArrayList<>(list));
        for(int ind = i ; ind < nums.length ; ind++){
            if(ind>i && nums[ind] == nums[ind-1])
                continue;
            list.add(nums[ind]);
            subsets(nums,ind+1,set,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> set = new ArrayList<>();
        subsets(nums,0,set,new ArrayList<Integer>());
        return set;
    }
}