class Solution {
    public int compress(char[] arr) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<arr.length){
        int j=i;
        int c=0;
             while(j < arr.length && arr[i] == arr[j]){
             j++;
             c++;
        }
        sb.append(arr[i]);
        if(c>1){
        sb.append(c);
        }
        i=j;
        }
      for(int k = 0; k < sb.length(); k++){
           arr[k] = sb.charAt(k);
}
      return sb.length();
 
    }
}