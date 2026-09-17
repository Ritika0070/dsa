class Solution {
    public boolean checkInclusion(String s1, String s2) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int n=s1.length();
      int m=s2.length();
      for(int i =0;i<n;i++){
        int x=s1.charAt(i);
        if(map.containsKey(x)){
            map.put(x,map.get(x)+1);
        }else{
            map.put(x,1);
        }
      }
      int c=map.size();
      int i=0;
      int j=0;
      while(j<m){
        int y=s2.charAt(j);
        if(map.containsKey(y)){
            map.put(y,map.get(y)-1);
            if(map.get(y)==0){
                c--;
            }
        }
        if(j-i+1==n){
            if(c==0){
                return true;
            }
            int l=s2.charAt(i);
                if(map.containsKey(l)){
                map.put(l,map.get(l)+1);
                if(map.get(l)==1){
                    c++;
                }
                
            }
            i++;
      }
      j++;
    }
          return false;
    }
}