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
    public ListNode reverseKGroup(ListNode head, int k) {
          int count =0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode currD = dummy;
        ListNode prev = null;
        ListNode curr= head;

        while(curr!=null){
           
           count++;
          curr= curr.next;

          if(count==k){
            ListNode tempCur = currD.next;
            ListNode groupTail = currD.next; 
             int tempK = k;

            prev = curr;

            while(tempK --> 0){
                ListNode temp = tempCur.next;
            tempCur.next= prev;

            prev = tempCur;

            tempCur = temp;
            }
           currD.next = prev;
           currD = groupTail;
            count =0;
          }
        }

        return dummy.next;

    }
}