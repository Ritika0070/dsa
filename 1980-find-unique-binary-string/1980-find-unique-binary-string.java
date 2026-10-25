class Solution {
    public String findDifferentBinaryString(String[] arr) {
        int n=arr.length;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String x=arr[i];
            if(!map.containsKey(x)){
                map.put(x,1);
            }else{
                continue;
            }
        }
        String ans="";
        for(int i =0;i<n;i++){
            String s=arr[i];
            String sb="";
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch =='1'){
                   ch='0';
                }else{
                   ch='1';
            }
            sb=sb+ch;
            }
            if(!map.containsKey(sb)){
              return sb;
            }
        }

         String an = "";

        for (int i = 0; i < n; i++) {
            an = an + "0";
        }

        if (!map.containsKey(an)) {
            return an;
        }

        return "1" + an.substring(1);
    
}
        
 }
        