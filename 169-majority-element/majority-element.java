class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int value = 0;
        int bal = 0;

        for(int i=0 ; i<n ; i++){
            if(bal == 0){
                value = nums[i];
            }
            
            if(nums[i]==value){
                bal++;
            }else{bal--;}
        }
        
        return value;
    }
}