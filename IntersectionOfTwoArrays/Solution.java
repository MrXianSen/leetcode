import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution{

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2, 1};
		int[] reuslt = new Solution().intersection(nums1, nums2);
		for(int i=0;i<reuslt.length;i++){
			System.out.println(reuslt[i]);
		}
	}

	public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null){
        	return null;
        }
        int len1 = nums1.length;
        int len2 = nums2.length;
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<len1;i++){
        	list.add(nums1[i]);
        }
        for(int i=0;i<len2;i++){
        	if(list.contains((Integer)nums2[i])){
        		set.add(nums2[i]);
        	}
        }

        int len = set.size();
        int[] result = new int[len];
        int i=0;
        Iterator<Integer> it = set.iterator();
        while(it.hasNext() && i < len){
        	int curr = it.next();
        	result[i++] = curr;
        }
        return result;
    }

}