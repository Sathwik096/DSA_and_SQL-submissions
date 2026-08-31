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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next == null){
            return new int[]{-1,-1};
        }
        ListNode prev , cur , nxt;
        prev = head;
        cur = head.next;
        nxt = cur.next;
        int count = 2 , min = Integer.MAX_VALUE , first=0 , p=0 ;
        while(nxt!=null){
            if((cur.val < prev.val && cur.val < nxt.val) || (cur.val > prev.val && cur.val > nxt.val)){
                if(first==0)
                    first = count;
                else{
                    min = Math.min(min , count - p);
                }
                p = count;
            }
            //System.out.println(min + " " + first + " " + p + " " + count);
            count++;
            prev = cur;
            cur = nxt;
            nxt = nxt.next;
        }
        if((first==0 && p==0) || first==p){
            return new int[]{-1,-1};
        }
        return new int[]{min , p - first};
    }
}