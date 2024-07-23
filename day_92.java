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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> a=new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        for(int i=0;i<a.size()/2;i++){
            if(a.get(i)!=a.get(a.size()-i-1)) return false;
        }
        return true;
    }
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Distinct Count -String Left Shift
		
		String st=new Scanner(System.in).next();
		Set<String> set=new HashSet<>();
		for(int i=0;i<st.length();i++){
		    set.add(st.substring(i)+st.substring(0,i));
		}
		System.out.print(set.size());

	}
}
