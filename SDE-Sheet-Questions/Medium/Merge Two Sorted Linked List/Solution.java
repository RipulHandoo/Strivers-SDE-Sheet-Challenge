import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> result = new LinkedListNode<>(null);
        LinkedListNode<Integer> curr = result;

        while(first != null && second != null){
            if(first.data < second.data){
                curr.next = first;
                first = first.next;
            }else{
                curr.next = second;
                second = second.next;
            }
            curr = curr.next;
        }

        if(first != null){
            curr.next = first;
        }else{
            curr.next = second;
        }

        return result.next;
	}
}
