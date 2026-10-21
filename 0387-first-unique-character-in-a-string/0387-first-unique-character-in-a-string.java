class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch =s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int x=-1;
    for(int i=0;i<n;i++){
        char ch = s.charAt(i);
        if(map.get(ch)==1){
         x=i;
        break;
    }
    }
    return x;
    }
}