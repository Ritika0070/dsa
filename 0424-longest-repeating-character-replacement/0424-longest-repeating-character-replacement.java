class Solution {
    public int characterReplacement(String s, int k) {
        int max=0;
        int n=s.length();
        for (char target = 'A'; target <= 'Z'; target++){
          int i=0;
          int count=0;
        for(int j=0;j<n;j++){
          char ch=s.charAt(j);
          if(ch==target)
          count++;
          while((j - i + 1) - count > k){
              if (s.charAt(i) == target){
              count--;
          }
          i++;
          }
          max=Math.max(max,j-i+1);
    }
        }
    return max;
    }
}