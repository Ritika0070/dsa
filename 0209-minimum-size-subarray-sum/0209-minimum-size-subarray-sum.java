class Solution {
    public int minSubArrayLen(int target, int[]arr) {
        int i=0;
        int min = Integer.MAX_VALUE;
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];
            while(sum>=target){
                int len=j-i+1;
                min=Math.min(min,len);
                sum=sum-arr[i];
                i++;
            }
        }if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}