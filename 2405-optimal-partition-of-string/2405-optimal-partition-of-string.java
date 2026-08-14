class Solution {
    public int partitionString(String s) {
        HashMap<Character ,Integer>map=new HashMap<>();
        int c=1;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                c++;
                map.clear();
                map.put(ch,i);
            }else{
                 map.put(ch,i);
            }
        }
        return c;
    }
}