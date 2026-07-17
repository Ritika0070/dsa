class Solution {
    public String convert(String s, int n) {
        if (n == 1 || s.length() <= n) return s;

        StringBuilder[] r = new StringBuilder[n];
        for (int i = 0; i < n; i++) r[i] = new StringBuilder();

        int i = 0;
        boolean d = false;

        for (char c : s.toCharArray()) {
            r[i].append(c);
            if (i == 0 || i == n - 1) d = !d;
            i += d ? 1 : -1;
        }

        StringBuilder a = new StringBuilder();
        for (StringBuilder sb : r) a.append(sb);

        return a.toString();
    }
}