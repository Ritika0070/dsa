class Solution {
    public int[] twoSum(int[] num, int target) {
        int[]arr=new int[2];
        int n=num.length;
        int l=0;
        int r=n-1;
        while(l<r){
            if(num[l]+num[r]==target){
                arr[0]=l+1;
                arr[1]=r+1;
                l++;
                r--;
            }else if(num[l]+num[r]<target){
                l++;
            }else{
               r--;
            }
        }
        return arr;
    }
}