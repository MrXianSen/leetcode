import java.util.List;
import java.util.ArrayList;

public class Solution{

	public static void main(String[] args) {
		
	}

	public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<len;i++){
        	threeSum(nums, i, i+1, len, target, result);
        }
        return result;
    }

    public void threeSum(int[] nums, int index, int left, int right, int target, List<List<Integer>> result) {
        Arrays.sort(nums);
        for(int i=left;i<right;i++){
        	if(i != 0 && nums[i] == nums[i - 1]){
        		continue;
        	}
        	int start = i+1;
        	int end = right - 1;
        	while(start < end){
        		int sum = nums[index] + nums[start] + nums[end] + nums[i];
        		if(sum > target){
        			end--;
        		}else if(sum < target){
        			start++;
        		}else if(sum == target){
        		    List<Integer> temp = new ArrayList<Integer>();
        		    temp.add(nums[index]);
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
    }
}