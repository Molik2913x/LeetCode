class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        int j = nums.length - 1;
        while(i >= 0){
            if(nums[i] < nums[i+1]){
                while(nums[j] <= nums[i]){
                    j--;
                }
                break;
            }
            else{
                i--;
            }
        }
        if(i >= 0){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        
        i = i + 1;
        j = nums.length - 1;
        

        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i ++;
            j --;
        }
    }
}