class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
        }
    }
    ArrayList<Character> list = new ArrayList<>();
    String sh = "";
    while(!map.isEmpty()){
        int max = 0;
        char l=0;
        for(char y:map.keySet()){
            int x=map.get(y);
            if(max<x){
                max=x;
                l=y;
            }
        }
            while(max!=0){
                list.add(l);
                max--;
            }
         map.remove(l);
    }
    for(char c:list){
        sh=sh+c;
    }
return sh;
    }
}