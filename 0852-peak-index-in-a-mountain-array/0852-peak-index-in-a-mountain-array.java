class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int x=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]==arr[i+1]){
                continue;
            }
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                x=i;
                break;
            }
        }
        return x;
    }
}