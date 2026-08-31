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
        int count = 2;
        List<Integer> arr = new ArrayList<>();
        while(nxt!=null){
            if(cur.val < prev.val && cur.val < nxt.val)
                arr.add(count);
            if(cur.val > prev.val && cur.val > nxt.val)
                arr.add(count);
            //System.out.println(prev.val + " " + cur.val + " " + nxt.val + " " + count);
            count++;
            prev = cur;
            cur = nxt;
            nxt = nxt.next;
        }
        if(arr.size()<2){
            return new int[]{-1,-1};
        }
        System.out.println(arr);
        int s = arr.size() , min = Integer.MAX_VALUE;
        for(int i=1;i<s;i++)
            min = Math.min(min,arr.get(i)-arr.get(i-1));
        return new int[]{min , arr.get(s-1) - arr.get(0)};
    }
}