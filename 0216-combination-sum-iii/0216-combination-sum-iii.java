class Solution {
    static void findSum(int[] nums,int i,int k,int n,int sum,List<List<Integer>> res,List<Integer> arr){
        if(arr.size() == k && sum == n){
            res.add(new ArrayList<>(arr));
            return;
        }
        if(arr.size() > k || i >= nums.length)
            return;
        arr.add(nums[i]);
        findSum(nums,i+1,k,n,sum+nums[i],res,arr);
        arr.remove(arr.size()-1);
        findSum(nums,i+1,k,n,sum,res,arr);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> res = new ArrayList<>();
        findSum(nums,0,k,n,0,res,new ArrayList<>());
        return res;
    }
}