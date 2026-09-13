class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }else{
                continue;
            }
        }
        String st=sb.toString();
        int l=0;
        int r=st.length()-1;
        while(l<r){
            if(st.charAt(l)!=st.charAt(r)){
                return false;
            }
                l++;
                r--;
        }
        return true;
    }
}