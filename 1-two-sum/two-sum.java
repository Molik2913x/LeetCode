import java.util.ArrayList;
import java.util.Collections;

//class pair

 class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<int[]>list = new ArrayList<>();

        for(int i =0 ; i<nums.length;i++){
            list.add(new int []{nums[i],i}); 
        }

        Collections.sort(list,(a,b)->Integer.compare(a[0],b[0]));

        //while loop

        int min = 0;
        int max = nums.length-1;

        while(min <max){
            int sum = list.get(min)[0]+list.get(max)[0];
            
            if(sum == target){
                return new  int [] {list.get(min)[1],list.get(max)[1]};
            }
            else if(sum <target){
                min++;
            }
            else{
                max--;
            }
        }
        return new int[]{-1,-1};
    }
}

