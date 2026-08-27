class Solution {
    public int climbStairs(int n) {
        int prev , prev2 , cur = 1;
        prev = 1;
        prev2 = 1;
        for(int i=2;i<n+1;i++){
            cur = prev + prev2;
            prev2 = prev;
            prev = cur;
        }
        return cur;
    }
}