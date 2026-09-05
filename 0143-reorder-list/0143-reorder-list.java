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
        ListNode slow=head;
        ListNode fast=head;
        while( fast.next != null && fast.next.next!= null){
            slow=slow.next;
            fast=fast.next.next;
        }   //using this find mid
        ListNode secound = slow.next; // slow compest the mid possition then remaining nodes are stord in secound then(make 2nd half)
        slow.next=null;  // brak the list and make it furst half

        //now revrse the 2nd half linked list;
        // reverse second
        ListNode prev = null;
        ListNode curr = secound;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        secound = prev;

        //now add the all nodes in head from secoun 1 after 1
        ListNode temp=head;
        curr = secound;
        while(curr !=null){
            ListNode nextTemp = temp.next;
            temp.next = curr;
            curr = curr.next;
            temp.next.next = nextTemp;
            temp = nextTemp;
        }
        
    }
}