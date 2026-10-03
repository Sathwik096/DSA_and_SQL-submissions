class Solution {
    public int longestValidParentheses(String s) {
        int open = 0 , close = 0 , len = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(')
                open++;
            else
                close++;
            if(close > open)
                close = open = 0;
            else if(open == close)
                len = Math.max(len,open+close);
        }
        open = close = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) == '(')
                open++;
            else
                close++;
            if(open > close)
                open = close = 0;
            else if(open == close)
                len = Math.max(len,open+close);
        }
        return len;
    }
}