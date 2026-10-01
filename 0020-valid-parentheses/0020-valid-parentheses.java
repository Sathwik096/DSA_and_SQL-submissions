class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int c = 0;
        for(char ch : s.toCharArray()){
            if(c < 0)
                return false;
            if(ch == '(' || ch == '{' || ch == '['){
                c++;
                st.push(ch);
            }
            else{
                if(!st.empty()){
                    if(ch == ')' && st.peek() == '('){
                        st.pop();
                        c--;
                    }
                    else if(ch == '}' && st.peek() == '{'){
                        st.pop();
                        c--;
                    }
                    else if(ch == ']' && st.peek() == '['){
                        st.pop();
                        c--;
                    }
                    else
                        st.push(ch);
                }
                else
                    c--;
            }
        }
        return c == 0 ;
    }
}