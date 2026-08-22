class Solution {
    static long countSmaller(long mid , int[] coins){
        int n = coins.length;
        long count = 0 ;
        long range = (int)Math.pow(2,n);
        for(long expr = 1 ; expr <= range-1 ; expr++){
            long order = 0 , LCM = 0;
            for(int i=0;i<n;i++){
                if((expr & (1 << i)) != 0){
                    order++;
                    if(LCM == 0)
                        LCM = coins[i];
                    else
                        LCM = (long) ((LCM*coins[i]) / (GCD(coins[i],(int)LCM)));
                }
            }
            if(order%2 == 0)
                count -= mid/LCM;
            else
                count += mid/LCM;
        }
        return count;
    }
    static int GCD(int a,int b){
        int temp;
        while(b>0){
            temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public long findKthSmallest(int[] coins, int k) {
        long res = -1;
        int max = coins[0];
        for(int i : coins){
            max = Math.max(i,max);
        }
        long l = 1 ;
        long r = (long)max*k ;
        long mid;
        while(l<=r){
            mid = l + (r-l)/2;
            if(countSmaller(mid,coins)>=k){
                res = mid;
                r = mid-1;
            }
            else
                l = mid+1;
        }
        return res;
    }
}