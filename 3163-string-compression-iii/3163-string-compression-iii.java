class Solution {
    public String compressedString(String arr) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<arr.length()){
        int j=i;
        int c=0;
             while(j < arr.length() && arr.charAt(i) == arr.charAt(j) && c<9){
               
             j++;
             c++;
                
        }
        sb.append(c);
        sb.append(arr.charAt(i));
        i=j;
        }
     String  ans =sb.toString();
     return ans;
    }
}
    