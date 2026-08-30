class Solution {
    static void seq(List<String> res,int n,String cur,int open,int close){
        if(cur.length() == 2*n){
                res.add(cur);
            return;
        }
        if(open < n)
            seq(res,n,cur + "(",open+1,close);
        if(close < open)
            seq(res,n,cur + ")",open,close + 1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        seq(res,n,"",0,0);
        return res;
    }
}