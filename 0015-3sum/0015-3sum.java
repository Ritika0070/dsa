class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
        int x=arr[i];
        int l=i+1;
        int r=arr.length-1;
        while(l<r){
            List<Integer>a=new ArrayList<>();
            int sum=x+arr[l]+arr[r];
            if(sum==0){
                a.add(x);
               a.add(arr[l]);
                a.add(arr[r]);
                l++;
                r--;
                  while(l<r && arr[l]==arr[l-1]) l++;
              while(l<r && arr[r]==arr[r+1]) r--;
               list.add(a);
            }else if(sum>0){
                r--;
            }else{
                l++;
            }
        }
        }
        return list;
    }
}