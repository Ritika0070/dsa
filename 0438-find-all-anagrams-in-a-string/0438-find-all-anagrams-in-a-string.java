class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        int n=p.length();
        for (int i = 0; i < n; i++) {
            char ch = p.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
            int i = 0;
            int j = 0;
            int count = map.size();
            while (j < s.length()) {
                   char c=s.charAt(j);
                   if(map.containsKey(c)){
                    map.put(c,map.get(c)-1);
                    if(map.get(c)==0){
                        count--;
                    }
                   }
                   if(j-i+1==n ){
                    if (count==0){
                        list.add(i);
                    }
                    char k=s.charAt(i);
                    if(map.containsKey(k)){
                    map.put(k,map.get(k)+1);
                    if(map.get(k)==1)
                   count++;
                   }                                                                                                          
                    i++;
                   }
                   j++;
            }
        
             return list;
    }
}