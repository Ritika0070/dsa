class Solution {
    public int numberOfSpecialChars(String word) {
        int[]lowarr=new int[26];
        int[]uparr=new int[26];
        Arrays.fill(lowarr,-1);
        Arrays.fill(uparr,-1);
        int n=word.length();
        for(int i=0;i<n;i++){
           char ch=word.charAt(i);
            if(ch>='a' && ch<='z'){
                lowarr[ch-'a']=i;
            }
            if(ch>='A' && ch<='Z'){
                if(uparr[ch-'A']==-1){
                    uparr[ch-'A']=i;
                }
            }
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(lowarr[i]!=-1 && uparr[i]!=-1 && lowarr[i]<uparr[i]){
                c++;
            }
        }
        return c;
    }
}