class Solution {
    public void moveZeroes(int[] arr) {
        int l=0;
        int r=1;
        for(int i=0;i<arr.length-1;i++){
        if(arr[l]==0 && arr[r]!=0){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r++;
        }
       else if(arr[l]==0 && arr[r]==0){
           r++;
       }else{
         l++;
         r++;
       }
        }
    }
}