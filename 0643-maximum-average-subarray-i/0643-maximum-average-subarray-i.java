class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int w_sum=0;
        for(int i=0;i<k;i++){
            w_sum+=arr[i];
        }
        int max_sum=w_sum;
        for(int i=k;i<arr.length;i++){
            w_sum=(w_sum)-(arr[i-k])+arr[i];
        max_sum=Math.max(w_sum,max_sum);
    }
    return (double)max_sum/k;
    }
}