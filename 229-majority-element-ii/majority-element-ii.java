
import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int freq = nums.length / 3;

        int first = 0, freq1 = 0;
        int second = 0, freq2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (freq1 == 0 && nums[i] != second) {
                first = nums[i];
                freq1 = 1;
            }
            else if (freq2 == 0 && nums[i] != first) {
                second = nums[i];
                freq2 = 1;
            }
            else if (nums[i] == first) {
                freq1++;
            }
            else if (nums[i] == second) {
                freq2++;
            }
            else {
                freq1--;
                freq2--;
            }
        }

        // Verification
        List<Integer> ans = new ArrayList<>();
        freq1 = 0;
        freq2 = 0;

        for (int num : nums) {
            if (num == first) {
                freq1++;
            }
            else if (num == second) {
                freq2++;
            }
        }

        if (freq1 > freq && freq1 > 0) {
            ans.add(first);
        }

        if (freq2 > freq && freq2 > 0 && second != first) {
            ans.add(second);
        }

        return ans;
    }
}

