class Solution {
    public int minimumSum(int num) {
        int[]arr=new int[4];
        for(int i=0;i<4;i++){
            int d=num%10;
            arr[i]=d;
            num=num/10;
        }
        Arrays.sort(arr);
        int x=arr[0]*10+arr[3];
        int y=arr[1]*10+arr[2];
        return x+y;
    }
}