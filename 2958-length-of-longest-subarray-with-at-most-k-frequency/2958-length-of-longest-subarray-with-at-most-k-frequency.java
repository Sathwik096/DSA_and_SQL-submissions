class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int maxLen =0 ;
        int maxFreq = 0;
        int l = 0 , r =0 ;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            maxFreq = Math.max(maxFreq,map.get(nums[r]));
            while(maxFreq > k){
                        if(map.get(nums[l]) == maxFreq){
                            map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                            maxFreq = map.get(nums[l]);
                        }
                        else
                            map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                    
                    l++;
            }
            if(maxFreq <= k)
                maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
    }    
