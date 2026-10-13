class Solution {
    public long maxAlternatingSum(int[] nums) {
        int[] n = new int[nums.length];
        for(int i=0;i<nums.length;i++)
            n[i] = Math.abs(nums[i]);
        Arrays.sort(n);
        for(int i : n)
            System.out.print(i + " ");
        int s = n.length;
        int l = 0 , r = s-1 ;
        long res = 0;
        while(l < (s/2) && r > (s/2)){
            res += n[r]*n[r];
            res -= n[l]*n[l];
            l++;
            r--;
        }
        if(s%2 == 0)
            res -= n[l]*n[l];
        // else
            res += n[r]*n[r];
        return res;
    }
    //1 1 2 2 3 3

}