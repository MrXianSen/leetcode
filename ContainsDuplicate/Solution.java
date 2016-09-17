import java.util.List;
import java.util.ArrayList;

public class Solution{
	public static void main(String[] args) {
		
	}

	public boolean containsDuplicate(int[] nums) {
		if(nums == null || nums.length == 0){
			return false;
		}
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++){
			if(list.contains(nums[i])){
				return true;
			}
		}
		return false;
	}
}