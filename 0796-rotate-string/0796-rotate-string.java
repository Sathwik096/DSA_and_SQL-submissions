class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(s);
        return sb.indexOf(goal) != -1;
    }
}
// a b c d e
// c d e a b