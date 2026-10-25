class Solution {
    public int duplicateNumbersXOR(int[] arr) {
       HashMap<Integer,Integer> map= new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int x=arr[i];
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        int u=0;
        for(int y:map.keySet()){
            int x=map.get(y);
            if(x==2){
              u=u^y;
            }
        }
        return u;
    }
}