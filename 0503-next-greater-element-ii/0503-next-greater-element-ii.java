class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n=arr.length;
        int[]res=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=n*2-1;i>=0;i--){
            int x= arr[i%n];
            while(st.size()>0 && st.peek()<=x){
                st.pop();
            }
            if(i<n){
            if(st.size()==0){
                res[i]=-1;
            }else{
                res[i]=st.peek();
            }
            }
             st.push(x);
            }
        return res;
    }
}