class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int m=n;
     while(m!=1){
           if (set.contains(m)) {
                return false;
            }
            set.add(m);
        int sum=0;
        while(m>0){
           int d=m%10;
          sum=sum+d*d;
           m=m/10;
        }
         m=sum;
     }
     return true;
    }
}