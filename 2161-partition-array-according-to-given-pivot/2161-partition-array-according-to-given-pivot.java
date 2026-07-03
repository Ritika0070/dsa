class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>less=new ArrayList<>();
        ArrayList<Integer>more=new ArrayList<>();
         ArrayList<Integer>equal=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                less.add(nums[i]);
              } 
              else if(nums[i] == pivot){
                equal.add(nums[i]);
                }else{
                more.add(nums[i]);
            }
        }
        ArrayList<Integer>merge=new ArrayList<>();
        int i=0;
        int j=0;
        int m=0;
        while(i<less.size()){
            merge.add(less.get(i));
            i++;
        }
        while(m<equal.size()){
            merge.add(equal.get(m));
            m++;
        }
        while(j<more.size()){
            merge.add(more.get(j));
            j++;
        }
         int[]result=new int[merge.size()];
        for(int k=0;k<merge.size();k++){
            result[k]=merge.get(k);
        }
        return result;
    }
}
