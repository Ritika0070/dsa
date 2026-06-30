class Solution {
    public int numberOfSubstrings(String s) {

     HashMap<Character, Integer> map = new HashMap<>();
    map.put('a', 0);
    map.put('b', 0);
    map.put('c', 0);

   int n=s.length();
    int ans=0;
    int j=0;
    int p=0;
    int count=3;
    while(j<n){
        char c=s.charAt(j);
        if(map.containsKey(c)){
            map.put(c,map.get(c)+1);
            if(map.get(c)==1)
            count--;
        }
        while(count==0){
            ans+=n-j;
        char left=s.charAt(p);
            map.put(left,map.get(left)-1);
            if(map.get(left)==0){
                count++;
            }
              p++;
        }
    j++;
    }
   return ans;
    }
}