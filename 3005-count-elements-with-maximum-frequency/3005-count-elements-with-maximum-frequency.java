class Solution {
    public int maxFrequencyElements(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= arr.length;
        for(int i=0;i<n;i++){
            int x=arr[i];
          if(map.containsKey(x)){
            map.put(x,map.get(x)+1);
          }else{
            map.put(x,1);
          }
        }
        int max=0;
        int sum=0;
        for(int z:map.keySet()){
            int y=map.get(z);
            if(max<y){
                max=y;
            }
        }
        for(int z:map.keySet()){
            int y=map.get(z);
            if(y==max){
                sum=sum+max;
            }
        }
        return sum ;

    }
}