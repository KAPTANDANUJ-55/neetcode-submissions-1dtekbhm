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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        } 
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;

        while(curr!=null){
         ListNode next = curr.next;
         curr.next = prev;
          prev = curr;
          curr = next;
        }

         ListNode l1 = head;
         ListNode l2 = prev;

         while(l2!=null){
            ListNode temp =  l1.next;
            ListNode temp1 =  l2.next;

             l1.next=l2;
             l2.next =temp;

             l1=temp;
             l2=temp1;
         }
    }
}