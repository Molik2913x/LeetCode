class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers cannot be palindromes
        if (x < 0) {
            return false;
        }

        int original = x;
        int rev = 0;

        // Reverse the entire number
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return original == rev;
    }
}