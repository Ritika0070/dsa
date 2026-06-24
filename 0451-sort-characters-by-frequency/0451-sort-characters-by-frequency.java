class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i =0;i<n;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        StringBuilder p = new StringBuilder();
        while(!map.isEmpty()){
        int max=0;
        char maxch=0;
        for(char f:map.keySet()){
            if(map.get(f)>=max){
            max=map.get(f);
            maxch=f;
        }
        }
        for(int j=1;j<=max;j++){
            p.append(maxch);
        }
        map.remove(maxch);
        }
        return p.toString();
    }
}