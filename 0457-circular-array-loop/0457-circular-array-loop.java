class Solution {
    public int cal(int[]num,int curr){
        int next=curr;
        int seq=num[curr];
        if(seq>0){
            next=(next+seq)%num.length;
        }else{
            int mod=seq%num.length;
            int forward=mod+num.length;
            next = (curr + forward) % num.length;
        }
        return next;
    }
    public boolean circularArrayLoop(int[] nums) {
        for(int i=0;i<nums.length;i++){
               HashSet<Integer>set =new HashSet<>();
            boolean isPos=nums[i]>0;
            int curr=i;
            while(true){
                int next=cal(nums,curr);
                    if(isPos){
                        if(nums[curr]<0){
                            break;
                        }else{
                            if(set.contains(next)){
                                if(curr!=next){
                                    return true;
                                 }else{
                                    break;
                                }
                        }
                            set.add(next);
                        }
                        }else{
                              if(nums[curr]>0){
                            break;
                        }else{
                            if(set.contains(next)){
                                if(curr!=next){
                                    return true;
                                }else{
                                    break;
                                }
                            }
                            set.add(next);
                        }
                        }
                    curr=next;
                }
        }
                 return false;
            }
}