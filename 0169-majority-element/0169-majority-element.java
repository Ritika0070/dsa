class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        HashMap <Integer, Integer> map=new HashMap<>();
        for(int i =0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int a=Integer.MIN_VALUE;
        int b=0;
        for(int x:map.keySet()){
            int y=map.get(x);
            if(y>=a){
            a = y;
            b = x;
        }
    }
       return b;
    }
}