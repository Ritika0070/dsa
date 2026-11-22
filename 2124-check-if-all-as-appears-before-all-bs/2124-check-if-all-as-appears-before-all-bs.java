class Solution {
    public boolean checkString(String s) {
        boolean flag=true;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if(ch>s.charAt(i+1)){
                flag = false;
                break;
            }
        }
       return flag;
    }
}