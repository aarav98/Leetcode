/*
 * Given a linked list, determine if it has a cycle in it.
 */
package solution;

public class LinkedListCycle {
	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head==null) return false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)return true;
        }
        return false;
    }
}
