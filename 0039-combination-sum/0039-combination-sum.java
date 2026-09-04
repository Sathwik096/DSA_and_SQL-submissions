class Solution {
    static void check(int[] a,int i,int k,List<List<Integer>> res,List<Integer> cur){
        if(i >= a.length ){
            if(k == 0)
                res.add(new ArrayList<>(cur));
            return;
        }
        if(a[i] <= k){
            cur.add(a[i]);
            check(a,i,k-a[i],res,cur);
            cur.remove(cur.size()-1);
        }
        check(a,i+1,k,res,cur);
    }
    public List<List<Integer>> combinationSum(int[] can, int target) {
        List<List<Integer>> list = new ArrayList<>();
        check(can,0,target,list,new ArrayList<>());
        return list;
    }
}