class Solution {
    static int MOD = 1000000007;
    static int[] dp = new int[2001];
    static int[] prev;
    static int count(int n){
        if(n == 0)
            return 1;
        if(dp[n] != -1)
            return dp[n];
        int total = (2 * count(n-1))%MOD;
        if(prev[n] != 0){
            int dup = count(prev[n]-1);
            total = (total - dup + MOD)%MOD;
        }
        return dp[n] = total;
    }
    public int distinctSubseqII(String s) {
        Arrays.fill(dp,-1);
        prev = new int[s.length()+1];
        int[] last = new int[26];
        for(int i=1;i<=s.length();i++){
            int idx = s.charAt(i-1) - 'a';
            prev[i] = last[idx];
            last[idx] = i;
        }
        return (count(s.length())-1 + MOD) %MOD;
    }
}