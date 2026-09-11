class Solution {
    private static void swap(int i,int j,int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    private static void reverse(int[] nums,int st){
        int i = st+1 , j =nums.length-1;
        while(i<j){
            swap(i,j,nums);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int pivot = nums.length-2;
        while(pivot>=0){
            if(nums[pivot] < nums[pivot+1]){
                break;
            }
            pivot--;
        }
        if(pivot>=0){
            int pivotLarge = nums.length-1;
            while(pivotLarge > pivot){
                if(nums[pivot] < nums[pivotLarge]){
                    swap(pivot,pivotLarge,nums);
                    break;
                }
                pivotLarge--;
            }
        }
        System.out.println(pivot);
        reverse(nums,pivot);
    }
}