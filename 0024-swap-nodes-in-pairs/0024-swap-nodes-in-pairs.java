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
    static ListNode swap(ListNode head){
        ListNode temp;
        temp = head.next;
        head.next = head.next.next;
        temp.next = head;
        return temp;
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode temp = head;
        ListNode prev = new ListNode(0);
        head = temp.next;
        while(temp != null && temp.next!=null){
            prev.next=swap(temp);
            prev = prev.next.next;
            temp = temp.next;
        }
        return head;
    }
}