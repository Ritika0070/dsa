class Solution {
    public int secondsBetweenTimes(String sT, String eT) {
        int sH=Integer.parseInt(sT.substring(0,2));
        int sM=Integer.parseInt(sT.substring(3,5));
        int sS=Integer.parseInt(sT.substring(6,8));
        int eH=Integer.parseInt(eT.substring(0,2));
        int eM=Integer.parseInt(eT.substring(3,5));
        int eS=Integer.parseInt(eT.substring(6,8));
        
        int startTotal=sH*3600+sM*60+sS;
        
        int endTotal=eH*3600+eM*60+eS;
        return endTotal-startTotal;
        
        
        
    }
}