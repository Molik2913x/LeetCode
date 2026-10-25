class Solution {
    public int maxProduct(int[] nums) {
        int max1=nums[0],min1=nums[0],ans=nums[0];

        if(nums.length==0){return 0;}

        for(int i=1 ; i<nums.length ; i++){
            int max0=max1;
            int min0=min1;
            max1 = Math.max(nums[i],Math.max(max0 *nums[i],min0*nums[i]));
            min1 = Math.min(nums[i],Math.min(max0 *nums[i],min0*nums[i]));

            ans = Math.max(ans , max1);
        }
        return ans;
    }
}