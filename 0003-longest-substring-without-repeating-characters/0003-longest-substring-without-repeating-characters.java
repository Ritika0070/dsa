class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=0;
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        while(j<n){
          char x=s.charAt(j);
          if(map.containsKey(x)){
            map.put(x,map.get(x)+1);
          }else{
            map.put(x,1);
          }
        
          while(map.get(x)>1){
            char l=s.charAt(i);
            map.put(l,map.get(l)-1);
            if(map.get(l)==0){
                map.remove(l);
            }
            i++;
          }
          int len=j-i+1;
          max=Math.max(max,len);
          j++;
        }
        return max;
    }
}