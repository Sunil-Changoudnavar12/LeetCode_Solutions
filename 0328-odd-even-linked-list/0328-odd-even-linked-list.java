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
    public ListNode oddEvenList(ListNode head) {
            // jar 1 kiva 0 nodes astil tr
        if(head == null || head.next == null){
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode EvenHead = even;

        while(even != null && even.next != null){
            //odd la connect kel
            odd.next = even.next;
            odd = odd.next;
            //even la connect kel ani te EvenHead madhe store ahe
            even.next = odd.next;
            even = even.next;

        }
           //mg odd ans even conncet kel
        odd.next = EvenHead;
        return head;
    }
}