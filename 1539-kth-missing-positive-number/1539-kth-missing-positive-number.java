class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max=0;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
            max=arr[i];
          }
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
          }
        ArrayList<Integer> list= new ArrayList<>();
        int x=max+k;
        int[]ans=new int[x];
        for(int i=0;i<x;i++){
            ans[i]=i+1;
            if(!map.containsKey(ans[i])){
                list.add(ans[i]);
            }else{
                continue;
            }
        }
        int v=0;
        int[]res=new int[list.size()];
        for(int f=0;f<list.size();f++){
            res[f]=list.get(f);
            if(f==k-1){
                v=res[f];
                break;
            }
        }
       return v;
    }
}