import java.util.Arrays;
public class Solution{
	public static void main(String[] args) {
		
	}

	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		return nums[len / 2];
	}

	public int majorityElement2(int[] nums) {
        int len = nums.length;
		Arrays.sort(nums);
		int count = 0;
		int lastNum = nums[0];
		for(int i=0;i<len;i++){
			if(nums[i] != lastNum) {
				lastNum = nums[i];
				count = 0;
			}
			if(count >= len/2) break;
			count++;
		}
		return lastNum;
    }
}