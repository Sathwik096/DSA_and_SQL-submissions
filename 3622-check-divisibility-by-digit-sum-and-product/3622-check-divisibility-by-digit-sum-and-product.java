class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0 , prod = 1;
        int num = n;
        while(num>0){
            sum += num%10;
            prod *= num%10;
            num = num/10;
        }
        return n%(sum+prod) == 0;
    }
}