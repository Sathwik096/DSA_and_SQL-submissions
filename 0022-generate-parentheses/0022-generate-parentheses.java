class Solution {
    static void generate(int n,int i,List<String> res,String s,int c){
        if(i == n){
            if(c == 0){
                res.add(new String(s));
            }
            return;
        }
        if(c < 0)
            return;
        generate(n,i+1,res,s+'(',c+1);
        generate(n,i+1,res,s+')',c-1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        generate(n*2,0,res,"",0);
        return res;
    }
}