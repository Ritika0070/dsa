class Solution {
    public String countAndSay(int n) {
        String ans="1";
        for(int k=2;k<=n;k++){
            StringBuilder sb = new  StringBuilder ();
            int i=0;
            while(i<ans.length()){
                int j=i;
                int c=0;
                while(j<ans.length() && ans.charAt(i)==ans.charAt(j)){
                    j++;
                    c++;
                }
                sb.append(c);
                sb.append(ans.charAt(i));
                i=j;
            }
            ans=sb.toString();
            }
        return ans;
    }
}