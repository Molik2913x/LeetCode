class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers and numbers ending in 0 cannot be palindromes
        // (except 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rev = 0;

        // Reverse only half of the number
        while (x > rev) {

            // Extract last digit and add it to reversed number
            rev = rev * 10 + x % 10;

            // Remove last digit from original number
            x /= 10;
        }

        // For even digits: x == rev
        // For odd digits: rev / 10 removes the middle digit
        return x == rev || x == rev / 10;
    }
}