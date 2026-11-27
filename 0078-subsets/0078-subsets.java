class Solution {
    static void sets(int[] nums,int i,List<List<Integer>> res,List<Integer> arr){
        if(i >= nums.length){
            res.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[i]);
        sets(nums,i+1,res,arr);
        arr.remove(arr.size()-1);
        sets(nums,i+1,res,arr);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        sets(nums,0,res,new ArrayList<Integer>());
        return res;
    }
}