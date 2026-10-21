class Solution {
    public int percentageLetter(String s, char l) {
        int k=0;
        int x=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch==l)
                k++;
            
        }
         x = (int)(k*100)/n;
        return x;
    }
}