package day8;
//Middle of the linked list -LC 876
/*Problem : Given the head of a singly linked list, return the middle node
if there are two middle nodes, return the second middle node.
 */
/*Idea : use two pointer : Slow( moves one node at a time) & fast pointer(moves two nodes at a time)
when the faster node reaches the end, the slower pointer will be at the middle
 */
public class p56 {
    //Define a linked list node
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    //optimal solution
    public static ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //Print the linked list
    public static void printList(ListNode head){
        ListNode current = head;
        while( current != null){
            System.out.print(current.val);
            if(current.next != null){
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }
    //main function
    void main() {
        //create linked list: 1->2->3->4-.5->6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        //Find the middle node
        ListNode result = middleNode(head);
        //Print the result
        System.out.print("Middle of the linked list: ");
        printList(result);
    }
}
