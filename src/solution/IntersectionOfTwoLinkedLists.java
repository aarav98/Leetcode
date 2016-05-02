/*
 * Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 */
package solution;

public class IntersectionOfTwoLinkedLists {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int alen = getLen(headA);
        int blen = getLen(headB);
        
        
        return (alen>blen)?advance(headA,alen-blen,headB):advance(headB,blen-alen, headA);
    }
    int getLen(ListNode head){
        int c=0;
        while(head!=null){
            head = head.next;
            c++;
           
        }
         return c;
    }
    ListNode advance(ListNode head, int a, ListNode b){
        while(a>0){
            head = head.next; a--;
        }
        while(head != null && b!=null){
            if(head.val == b.val) return head;
            head = head.next; b= b.next;
        }
        return null;
    }

}
