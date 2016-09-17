public class Solution{
	public static void main(String[] args) {
		System.out.println(new Solution().isUgly(33));
	}

	/**
	 * if num % 2^n * 3^n * 5^n == 0
	 * then 
	 * num is ugly number
	 * @param  num [description]
	 * @return     [description]
	 */
	public boolean isUgly(int num) {
		if(num <= 0) return false;
		if(num == 1) return true;
		while(num >= 2 && num % 2 == 0) num /= 2;
		while(num >= 3 && num % 3 == 0) num /= 3;
		while(num >= 5 && num % 5 == 0) num /= 5;
		return num == 1;
    }
}