class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
          int x=nums[i];
          if(map.containsKey(x)){
            map.put(x,map.get(x)+1);
          }else{
            map.put(x,1);
          }
        }
        for(int y:map.keySet()){
            int x=map.get(y);
            if(x%2!=0){
                return false;
            }
        }
        return true;
    }
}