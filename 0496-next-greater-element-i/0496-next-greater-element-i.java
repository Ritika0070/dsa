class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int[]res=new int[nums2.length];
        Arrays.fill(res,-1);
        for(int i=0;i<nums2.length;i++){
            for(int j=i+1;j<nums2.length;j++){
                if(nums2[i]<nums2[j]){
                    res[i]=nums2[j];
                    break;
                }
            }
        }
        int []a=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    a[i] = res[j];
                    break;
                }
            }
        }
        return a;
    }
}