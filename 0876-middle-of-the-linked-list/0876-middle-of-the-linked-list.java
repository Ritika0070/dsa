/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        ListNode fast=head;
        ListNode slow=head;
        if(c%2==0){
            while(fast!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
        }else{
             while(fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
        }
        return slow;
    }
}