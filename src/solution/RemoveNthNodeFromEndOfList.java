/*
 * Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 */
package solution;

public class RemoveNthNodeFromEndOfList {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode curr = head, p = head;
        for(int i = 0; i<n; i++){
            p = p.next;
        }
        if(p == null){
            head = head.next;
            return head;
        }
        while(p.next != null){
            p=p.next; curr = curr.next;
        }
        
        curr.next = curr.next.next;
        return head;
    }

}
