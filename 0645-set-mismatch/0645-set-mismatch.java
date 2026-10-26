class Solution {
    public int[] findErrorNums(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int []ans= new int[2];
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int x=arr[i];
            sum=sum+x;
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        for(int k:map.keySet()){
            int y=map.get(k);
            if(y==2){
                ans[0]=k;
            }
        }
        int t=(n*(n+1))/2;
        int a=t-(sum-ans[0]);
        ans[1]=a;
        return ans;
    }
}