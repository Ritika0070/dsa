class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer>map=new HashMap<>();
        ArrayList<String>list=new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int n=list1.length;
        int m=list2.length;
        for(int i=0;i<n;i++){
            String x=list1[i];
            map.put(x,i);
        }
        for(int i=0;i<m;i++){
            String y=list2[i];
           if(map.containsKey(y)){
             int sum=map.get(y)+i;
             if(sum<min){
                min=sum;
                list.clear();
                list.add(y);
             }else if(sum==min){
                list.add(y);
             }else{
                continue;
             }
           }
        }
    String[]ans=new String[list.size()];
    for(int i=0;i<list.size();i++){
        ans[i]=list.get(i);
    }
    return ans;
    }
}