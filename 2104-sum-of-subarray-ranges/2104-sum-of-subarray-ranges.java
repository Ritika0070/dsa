class Solution {
    public long subArrayRanges(int[] arr) {
        // Arrays.sort(arr);
        int n=arr.length;
        long sum=0;
        for(int i=0;i<n;i++){
            int max=arr[i];
            int min=arr[i];
            for(int j=i;j<n;j++){
                 if(arr[j]>max){
                    max=arr[j];
                 }
                 if(arr[j]<min){
                    min=arr[j];
                 }
                int x=max-min;
                sum=sum+x;
            }
        }
        return sum;
    }
}