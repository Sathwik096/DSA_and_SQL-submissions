class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0 , depth = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(')
                depth++;
            else{
                if(depth > 0)
                    depth--;
                else
                    count++;
            }
        }
        return depth+count;
    }
}