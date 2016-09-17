import java.util.Stack;
import java.util.Arrays;

public class Solution{

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,3};
		System.out.println(new Solution().singleNumber(nums));
	}

	public int singleNumber(int[] nums	){
		if(nums == null || nums.length == 0){
			return 0;
		}
		Arrays.sort(nums);
		int len = nums.length;
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0;i<len;i++){
			if(s.isEmpty()){
				s.push(nums[i]);
			}else{
				if(s.peek() == nums[i]){
					s.pop();
				}else{
					s.push(nums[i]);
				}
			}
		}
		if(!s.isEmpty()){
			return s.pop();
		}else{
			return 0;
		}
	}

}