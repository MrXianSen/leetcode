
public class Solution{
	public static void main(String[] args) {
		System.out.println(new Solution().addDigits(56));
	}

	public int addDigits(int num){
		if(num == 0) {
			return 0;
		}
		int sum = 0;
		while(num != 0){
			int curr = num % 10;
			sum += curr;
			num = num / 10;
		}
		if(sum >= 10){
			sum = addDigits(sum);
		}
		return sum;
	}
}