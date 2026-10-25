class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        
        List<List<Integer>> list =new ArrayList<>();

        for(int i = 0 ; i<n-2 ; i++){

            if(i>0 && nums[i]== nums[i-1]){
                continue;
            }

            int target = -1 * nums[i];
            int left = i+1;
            int right = n-1;
            while(left<right){
                int res = nums[left] + nums[right];
           
           if (target == res){
                list.add(Arrays.asList(nums[i],nums[left],nums[right]));

                right --;
                left ++;

                while (left < right && nums[left] == nums[left - 1]){
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]){
                    right--;
                }
           }

           else if (res < target){
            left++;
           }
           else {
            right--;
           }
        }
            
        }
    
        return list;
    }
}