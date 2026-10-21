class Solution {
    public int similarPairs(String[] w) {
        int c=0;
        int n=w.length;
        for(int i=0;i<n-1;i++){
            HashMap<Character,Integer> map = new HashMap<>();
            String x=w[i];
            for(int j=0;j<x.length();j++){
            char ch=x.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
        }
        for(int k=i+1;k<n;k++){
            String y=w[k];
                boolean flag = true;
            for(int v=0;v<y.length();v++){
                char ch=y.charAt(v);
                if(!map.containsKey(ch)){
                    flag=false;
                    break;
                }
            }
            if(flag && map.size() == y.chars().distinct().count()){
                c++;
            }
        }
    }
    return c;
    }
}