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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur = list1;
        ListNode cur2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        
        while( cur!=null  && cur2!=null ){
            if(cur.val<=cur2.val){
                temp.next = cur;
                temp = temp.next;
                cur = cur.next;
            }else if(cur.val>cur2.val){
                temp.next = cur2;
                temp=temp.next;
                cur2 = cur2.next;
            }
        }
        if(cur!=null){
            temp.next=cur;
        }
        if(cur2!=null){
            temp.next = cur2;
        }
        return dummy.next;
    }
}