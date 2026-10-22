class Solution {
    public char repeatedCharacter(String s) {
        char ans=0;
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                ans=ch;
                break;
            }
        }
            return ans;
        }
}
            
            