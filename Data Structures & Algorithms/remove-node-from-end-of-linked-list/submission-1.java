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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    head =  reverseList(head);
       ListNode prev = null;
     
ListNode curr = head;
       if(n==1){
        head = head.next;
       }
       else{
        
        for(int i=1;i<n-1;i++){
           curr = curr.next;
        }
        curr.next = curr.next.next;
       }
       head = reverseList(head);
       return head;
    }

     public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr= head;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next= prev;

            prev = curr;

            curr = temp;
        }

        return prev;

    }
}