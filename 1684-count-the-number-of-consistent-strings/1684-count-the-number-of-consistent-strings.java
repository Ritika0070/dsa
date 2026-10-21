class Solution {
    public int countConsistentStrings(String a, String[] w) {
        int c=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(!map.containsKey(ch)){
            map.put(ch,1);
            }
        }
        for(int i=0;i<w.length;i++){
            String s=w[i];
            boolean found= true;
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if(!map.containsKey(ch)){
                    found=false;
                    break;
            }
        }
        if(found){
            c++;
        }
    }
    return c;
    }
}