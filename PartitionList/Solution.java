import java.util.List;
import java.util.ArrayList;
public class Solution{
	
	public static void main(String[] args) {
		
	}

	public ListNode partition(ListNode head, int x) {
        if(head == null){
        	return null;
        }
        while(head != null){
        	list.add(head.val);
        	head = head.next;
        }
        int len = list.size();
        int[] arr = new int[len];
        int index = 0;
        for(int i=0;i<len;i++){
        	arr[i] = list.get(i);
        	if(arr[i] == x){
        		index = i;
        	}
        }
        for(int i=0;i<index;i++){
        	if(arr[i] >= x){
        		int temp = arr[i];
        		
        	}
        }
    }

}