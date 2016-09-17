import java.util.Arrays;
public class Soluttion{
	public static void main(String[] args) {
		
	}

	public int missingNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0;i<len;i++){
        	if(count != nums[i]){
        		return count;
        	}
        	count++;
        }
        return count;
    }
}