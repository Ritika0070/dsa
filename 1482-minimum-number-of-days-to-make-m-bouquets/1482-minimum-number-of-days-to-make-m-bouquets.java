class Solution {
    public int minDays(int[] b, int m, int k) {
        if((long)b.length <(long) m*k){
           return -1;
        }
        int max=0;
        for(int i=0;i<b.length;i++){
          if(b[i]>max){
          max=b[i];
          }
        }
        int l=1;
        int r= max;
        int res=Integer.MAX_VALUE;
        while(l<=r){
              int x=0;
              int y=0;
            int mid=(l+r)/2;
            for(int i=0;i<b.length;i++){
                if(b[i]<=mid){
                  x++;
                if(x==k){
                   y++;
                   x=0;
                }
                }else{
                    x=0;
                }
            }
                if(y>=m){
                   res=Math.min(res,mid);
                   r=mid-1;
                }else{
                 l=mid+1;
                }
            }
            return res;
    }
}