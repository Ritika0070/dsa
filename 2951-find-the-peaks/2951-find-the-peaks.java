class Solution {
    public List<Integer> findPeaks(int[] m) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<m.length-1;i++){
            if(m[i]==m[i-1]){
                continue;
            }
            if(m[i]==m[i+1]){
                continue;
            } 
            if(m[i]>m[i-1]&&m[i]>m[i+1]){
                list.add(i);
            }
        }
        return list;
    }
}