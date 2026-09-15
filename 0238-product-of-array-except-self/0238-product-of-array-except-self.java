class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int []left=new int[n];
        int []right=new int[n];
        int []res=new int[n];

        int pro=1;
        for(int i=0;i<n;i++){
            left[i]=pro;
            pro=arr[i]*pro;
        }
        pro=1;
        for(int i=n-1;i>=0;i--){
           right[i]=pro;
           pro=arr[i]*pro;
        }
        for(int i=0;i<n;i++){
            res[i]=left[i]*right[i];
        }
        return res;
    }

}