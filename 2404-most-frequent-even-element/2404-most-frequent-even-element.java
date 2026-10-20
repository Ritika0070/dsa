class Solution {
    public int mostFrequentEven(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int a=0;
        int b=-1;
        for(int x:map.keySet()){
            int y = map.get(x);
            if(x%2==0){
                if(y>a){
                    a=y;
                    b=x;
                }else if (y==a){
                    b=Math.min(b,x);
                }
            }
        }
        return b;
    }
}