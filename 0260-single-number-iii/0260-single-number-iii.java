class Solution {
    public int[] singleNumber(int[] arr) {
        int n= arr.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            int x=arr[i];
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        ArrayList<Integer> list= new ArrayList<>();
        for(int y:map.keySet()){
            int x=map.get(y);
            if(x==1){
                list.add(y);
            }
        }
        int[]ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}