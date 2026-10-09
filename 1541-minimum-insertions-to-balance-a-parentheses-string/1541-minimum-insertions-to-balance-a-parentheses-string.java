class Solution {
    public int minInsertions(String s) {
        int open = 0 , i = 0 , count = 0;
        int n = s.length();
        while(i<n){
            if(s.charAt(i) == '('){
                open++;
                i++;
            }
            else{
                if(open > 0)
                    open--;
                else
                    count++;
                if(i+1 < n && s.charAt(i+1) == ')'){
                    i+=2;
                }
                else{
                    count++;
                    i+=1;
                }
            }
        }
        return count+(open*2);
    }
}