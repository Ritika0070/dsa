class Solution {
    public String longestPalindrome(String s) {
        int n = s.length(), a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            int l1 = f(s, i, i);
            int l2 = f(s, i, i + 1);
            int l = Math.max(l1, l2);
            if (l > b - a) {
                a = i - (l - 1) / 2;
                b = i + l / 2;
            }
        }
        return s.substring(a, b + 1);
    }

    int f(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }
}