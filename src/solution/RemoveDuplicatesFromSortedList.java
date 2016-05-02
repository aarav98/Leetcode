/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
package solution;

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        
        ListNode curr = head;
        ListNode next ;
        while(curr.next != null){
            if(curr.val == curr.next.val){
                next = curr.next.next;
                //curr.next = null;
                curr.next = next;
            }else{
                curr = curr.next;
            }
        }
        
        return head;
    }
}
