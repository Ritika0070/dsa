class Solution {
    public int alternateDigitSum(int n) {
      Stack<Integer> st = new Stack<>();
      int sum=0;
        while(n!=0){
            int d=n%10;
            st.push(d);
            n=n/10;
        }
        int[]arr=new int[st.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=st.pop();
        }
        for(int i=0;i<arr.length;i++){
          if(i%2==0){
            sum+=arr[i];
          }else{
            sum-=arr[i];
          }
        }
        return sum;
    }
}