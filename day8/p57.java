package day8;
//Reverse linked list -LC 206
/*Problem : given the head of a singly linked list,
- reverse the list and return the reversed list's head.

Idea : we need to reverse the direction of the links between the nodes.
- Key--> change eery node's pointer to point to the previous node instead of the next node.
 */
public class p57 {
    //Node structure of singly linked list
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val =val;
            this.next = null;
        }
    }
    //function to reverse the linked list
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            //save the next node
            ListNode next = curr.next;
            //Reverse the current link
            curr.next = prev;
            //Move prev forward
            prev = curr;
            //Move curr forward
            curr = next;
        }
        //return the new head
        return prev;
    }
    //Print linked list
    public static void printList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val);
            if(curr.next != null){
                System.out.print("->");
            }
            curr = curr.next;
        }
        System.out.println();
    }
    void main(){
        //create linked list: 1->2->3->4-.5->6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        //reverse the linked list
        head = reverseList(head);
        //Print the result
        System.out.print("Reversed linked list: ");
        printList(head);
    }
}
