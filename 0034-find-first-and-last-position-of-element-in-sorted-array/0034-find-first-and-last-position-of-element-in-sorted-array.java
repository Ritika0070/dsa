class Solution {
    public int[] searchRange(int[] arr, int k) {
        int n=arr.length;
        int s=0;
        int h=n-1;
        int res=-1;
        int c=0;
        while(s<=h){
            int mid=(s+h)/2;
            if(arr[mid]==k){
               res=mid;
               h=mid-1;
            }
            if(arr[mid]>k){
                h=mid-1;
            }
             if(arr[mid]<k){
                s=mid+1;
            }
        }
          if (res == -1) {
            return new int[]{-1, -1};
        }
        int x=res;
  
        while(res < arr.length && arr[res]==k){
            c++;
            res++;
        }
        int last= x+c-1;

        return new int[]{x, last};
    }
}