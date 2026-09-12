class Solution {
    public int longestOnes(int[] arr, int k) {
        int n=arr.length;
        int c=0;
        int j=0;
        int max=0;
        for(int i=0;i<n;i++){
          if(arr[i]==0){
            c++;
          }
          while(c>k){
            if(arr[j]==0){
                c--;
            }
            j++;
          }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}