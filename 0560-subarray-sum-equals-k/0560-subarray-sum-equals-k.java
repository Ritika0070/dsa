class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int c=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            int x=sum-k;
            if(map.containsKey(x)){
                c+=map.get(x);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else
                map.put(sum,1);
            }
            
        
        return c;
    }
}