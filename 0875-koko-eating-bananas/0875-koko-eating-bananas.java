class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        Arrays.sort(arr);
        int n=arr.length;
        int l=1;
        int r=arr[n-1];
       int min_k=Integer.MAX_VALUE;
        while(l<=r){
            int mid=(l+r)/2;
            long sum=0;
            for(int i=0;i<n;i++){
                long d= (arr[i]+mid-1)/mid; //ceiling value ke liye aise kiye h 
                sum=d+sum;
            }
            if(sum<=h){
                min_k=Math.min(min_k,mid);
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return min_k;
    }
}