import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here!
		Stack<Integer> s = new Stack<>();
		LinkedListNode ptr = head;
		while(ptr != null){
			s.push((int)ptr.data);
			ptr = ptr.next;
		}

		ptr = head;
		while(ptr != null){
			int value1 = s.pop();
			int value2 = (int)ptr.data;
			if(value1 != value2){
				return false;
			}
			ptr = ptr.next;
		}

		return true;
	}
}
