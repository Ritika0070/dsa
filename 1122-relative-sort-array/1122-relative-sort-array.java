class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            int x= arr1[i];
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        ArrayList<Integer> list= new ArrayList<>();
        int[]ans=new int[arr1.length];
        for(int i=0;i<arr2.length;i++){
            int y=arr2[i];
            if(map.containsKey(y)){
                while(map.get(y)!=0){
                list.add(y);
                map.put(y, map.get(y) - 1);
            }
        }
        }
        ArrayList<Integer> remaining = new ArrayList<>();
        for(int r:map.keySet()){
             while (map.get(r) != 0) {
            remaining.add(r);
           map.put(r, map.get(r) - 1);
             }
        }
         Collections.sort(remaining);
          list.addAll(remaining);
        
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}