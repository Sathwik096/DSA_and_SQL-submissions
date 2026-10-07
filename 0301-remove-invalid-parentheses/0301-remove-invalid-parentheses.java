class Solution {
    static void generate(int i,String s,int count,HashSet<String> set,StringBuilder cur,int[] max){
        if(count < 0)
            return;
        if(i == s.length()){
            if(count == 0){
                if(cur.length() > max[0]){
                    set.clear();
                    max[0] = cur.length();
                }
                if(cur.length() == max[0])
                    set.add(cur.toString());
            }
            return;
        }
        char ch = s.charAt(i);
        int len = cur.length();
        if(s.charAt(i) != '(' && s.charAt(i) != ')'){
            cur.append(ch);
            generate(i+1,s,count,set,cur,max);
            cur.setLength(len);
            return;
        }
        cur.append(ch);
        generate(i+1,s,count+(s.charAt(i) == '(' ? 1 : -1),set,cur,max);
        cur.setLength(len);
        generate(i+1,s,count,set,cur,max);
        return;
    }
    public List<String> removeInvalidParentheses(String s) {
        HashSet<String> set = new HashSet<>();
        generate(0,s,0,set,new StringBuilder(),new int[1]);
        return new ArrayList<>(set);
    }
}