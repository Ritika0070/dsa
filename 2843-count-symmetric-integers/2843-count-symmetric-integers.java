class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int y=0;
        for(int i=low;i<=high;i++){
            int c=0;
            int l_sum=0;
            int r_sum=0;
            int temp=i;
            while(temp!=0){
                 temp=temp/10;
                 c++;
            }
            if(c%2!=0){
                continue;
            }else{
                String s = String.valueOf(i);
                int mid = c/2;
                for(int j=0;j<mid;j++){
                    char ch=s.charAt(j);
                    int x=ch-'0';
                   l_sum=l_sum+x;
                }
                 for(int j=mid;j<c;j++){
                    char ch=s.charAt(j);
                    int x=ch-'0';
                   r_sum=r_sum+x;
                }
            if(r_sum==l_sum){
                y++;
            }
            }
        }
        return y;
    }
}