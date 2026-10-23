class Solution {
    public int countHillValley(int[] arr) {
        int c=0;
        for(int i=1;i<arr.length-1;i++){
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            int left=i-1;
            int right=i+1;
            while(left>=0 && arr[left]==arr[i]){
                left--;
            }
            while(right<arr.length && arr[right]==arr[i]){
                right++;
            } 
            if (left >= 0 && right < arr.length) {
            if(arr[i]>arr[left] && arr[i]>arr[right]) {
                 c++;
            }  
             if(arr[i]<arr[left] && arr[i]<arr[right]) {
                 c++;
            }  
    }
        }
      return c;  
    }
}