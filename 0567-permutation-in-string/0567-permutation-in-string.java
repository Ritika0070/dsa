class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            char x=s1.charAt(i);
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        int i=0;
        int j=0;
        int c=map.size();
        while(j<m){
            char ch=s2.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    c--;
                }
            }
            if(j-i+1==n){
                if(c==0){
                    return true;
                }
                char left=s2.charAt(i);
                if(map.containsKey(left)){
                map.put(left,map.get(left)+1);
                    if(map.get(left)==1)
                     c++;
                   }
                   i++;
            }
            j++;

        }
        return false;
    }
}