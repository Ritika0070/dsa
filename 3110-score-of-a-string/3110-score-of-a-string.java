class Solution {
    public int scoreOfString(String s) {
        int[]arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int x=(int) ch;
            arr[i]=x;
        }
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            int y=Math.abs(arr[i]-arr[i+1]);
            sum=sum+y;
        }
        return sum;
    }
}