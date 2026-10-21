class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char x=s.charAt(i);
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!map.isEmpty()){
            int max=0;
            char l=0;
            for(char x:map.keySet()){
                int y=map.get(x);
                if(max<y){
                    l=x;
                    max=y;
                }
            }
                    while(max!=0){
                        sb.append(l);
                        max--;
                    }
    
               map.remove(l);
        }
        String str = sb.toString();
        return str;
    }
}