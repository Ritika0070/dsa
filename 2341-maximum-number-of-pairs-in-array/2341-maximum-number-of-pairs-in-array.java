class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x= nums[i];
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
                }
                else{
                    map.put(x,1);
                }
        }
        ArrayList<Integer> list= new ArrayList<>();
        int c=0;
        int k=0;
        for(int x:map.keySet()){
            int y=map.get(x);
             c+=y/2;
             k+=y%2;
        }
        list.add(c);
        list.add(k);
        int[]ans=new int[2];
        for(int i=0;i<2;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}