class Solution {
    public int countDigits(int num) {
        int c=0;
        int y=num;
        String s=String.valueOf(y);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int x=ch-'0';
            if(num%x==0){
                c++;
            }
        }
        return c;
    }
}