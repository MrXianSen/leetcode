import java.util.List;
import java.util.ArrayList;
public class SolutionII{
	public static void main(String[] args) {
		int[] nums1 = {};
		int[] nums2 = {};
		int[] result = new SolutionII().intersect(nums1, nums2);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

	public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
        	l1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
        	if(l1.contains(nums2[i])){
        		l1.remove((Integer)nums2[i]);
        		l2.add(nums2[i]);
        	}
        }
        int[] result = new int[l2.size()];
        for(int i=0;i<l2.size();i++){
        	result[i] = l2.get(i);
        }
        return result;
    }
}