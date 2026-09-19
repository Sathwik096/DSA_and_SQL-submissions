class Solution {
    static int MOD = 1000000007;
    static int findPower(long a,long b){
        if(b == 0)
            return 1;
        long half = findPower(a,b/2);
        long result = (half * half) % MOD ;
        if(b % 2 == 1){
            result = (result * a) % MOD;
        }
        return (int)result;
    }
    public int countGoodNumbers(long n) {
        return (int)((long)findPower(5 , (n+1)/2) * findPower(4, n/2) % MOD);
    }
}