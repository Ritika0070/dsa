class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0;
        int l=1;
        while(l<arr.length){
            if(arr[i]==arr[l]){
                l++;
            }else{
                i++;
                arr[i]=arr[l];
            }
        }
      return i+1;
    }
}