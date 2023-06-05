/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution
{
    public static Node findMiddle(Node head)
    {
        // Write your code here.

        Node hare = head;
        Node turtle = head;
        
        while(hare != null && hare.next != null && turtle != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }

        return turtle;
    }
}
