import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Solution{
	public static void main(String[] args) {
		
	}

	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int len = nums.length;
        for(int i=0;i<len;i++){
        	if(i != 0 && nums[i] == nums[i - 1]){
        		continue;
        	}
        	int start = i+1;
        	int end = len - 1;
        	while(start < end){
        		int sum = nums[start] + nums[end] + nums[i];
        		if(sum > 0){
        			end--;
        		}else if(sum < 0){
        			start++;
        		}else if(sum == 0){
        		    List<Integer> temp = new ArrayList<Integer>();
        			temp.add(nums[i]);
        			temp.add(nums[start]);
        			temp.add(nums[end]);
        			result.add(temp);
        			start++;
        			end--;
        			while(start < end && nums[start] == nums[start - 1]){
        				start ++;
        			}
        			while(start < end && nums[end] == nums[end+1]){
        				end--;
        			}
        		}
        	}
        }
        return result;
    }
}