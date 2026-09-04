class Solution {
    static void check(int[] a,int i,int k,List<List<Integer>> res,List<Integer> cur){
        if(k == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int ind = i ; ind<a.length ; ind++){
            if(ind > i && a[ind] == a[ind-1])
                continue;
            if(a[ind]>k)
                break;
            cur.add(a[ind]);
            check(a,ind+1,k-a[ind],res,cur);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        check(candidates,0,target,list,new ArrayList<>());
        return list;
    }
}