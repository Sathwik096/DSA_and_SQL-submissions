class Solution {
    public String removeOuterParentheses(String s) {
        StringBuffer sb=new StringBuffer();
        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                k++;
                if(k>1)
                    sb.append(s.charAt(i));
            }
            else if(s.charAt(i)==')') {
                if(k>1)
                    sb.append(s.charAt(i));
                k--;
            }
        }
        return sb.toString();
    }
}