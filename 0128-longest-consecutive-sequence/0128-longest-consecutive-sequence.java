class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);
        int count = 0 , max = 0;
        for(Integer i : set){
            if(!set.contains(i-1)){
                count = 0;
                int n = i;
                while(set.contains(n)){
                    count++;
                    n++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}