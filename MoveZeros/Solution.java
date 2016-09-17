
import java.util.Stack;

public class Solution{

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		new Solution().moveZeroes1(nums);
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}

	public void moveZeroes(int[] nums) {
		if(nums == null || nums.length == 0){
			return;
		}
		int len = nums.length;
		int count = 0;
		for(int i=0;i<len;i++){
			while(nums[i] == 0){
				System.arraycopy(nums, i+1, nums, i, len - i - 1);
				count++;
			}
		}
		for(int i=0;i<count;i++){
			nums[len - i - 1] = 0;
		}
    }

    public void moveZeroes1(int[] nums){
    	if(nums == null || nums.length == 0){
    		return;
    	}
    	int len = nums.length;
    	int count = 0;
    	Stack<Integer> s = new Stack<Integer>();
    	for(int i=0;i<len;i++){
    		if(nums[i] != 0){
    			s.push(nums[i]);
    		}else{
    			count++;
    		}
    	}
    	int index = len-1;
    	int i = 0;
    	while(index >= 0 && i< count){
    		nums[index--] = 0;
    		i++;
    	}
    	while(!s.isEmpty() && index >= 0){
    		nums[index--] = s.pop();
    	}
    }
}