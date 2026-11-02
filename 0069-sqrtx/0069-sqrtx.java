class Solution {
    public int mySqrt(int x) {
        long l = 0 , h = x , m , res = 0;
        while(l<=h){
            m = l + (h-l)/2;
            if((m*m) <= x){
                res = m;
                l = m+1;
            }
            else
                h = m-1;
        }
        return (int)res;
    }
}