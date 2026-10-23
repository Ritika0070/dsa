class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map =new HashMap<>();
        HashMap<Integer,Integer> mp =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int x:map.keySet()){
            int y=map.get(x);
            if(mp.containsKey(y)){
                return false;
            }else{
                mp.put(y,1);
            }
        }
        return true;
    }
}