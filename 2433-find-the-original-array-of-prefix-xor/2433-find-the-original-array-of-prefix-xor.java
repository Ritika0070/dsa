class Solution {
    public int[] findArray(int[] p) {
        int n=p.length;
        int[]ans=new int [n];
        ans[0]=p[0];
        for(int i=1;i<n;i++){
            ans[i] = p[i] ^ p[i - 1];
        }
        return ans;
    }
}