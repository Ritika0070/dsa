class Solution {
    public int totalFruit(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int max=0;
        for(int j=0;j<arr.length;j++){
            int ch=arr[j];
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
                }else{
                    map.put(ch,1);
                }
            while(map.size()>2){
                int l=arr[i];
                map.put(l,map.get(l)-1);
                if(map.get(l)==0){
                    map.remove(l);
                }
                 i++;
            }
           int len=j-i+1;
           max=Math.max(max,len);
        }
        return max;
    }
}