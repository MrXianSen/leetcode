public class Solution{
	public static void main(String[] args) {
		System.out.println(new Solution().isPowerOfThree(81));
	}

	public boolean isPowerOfThree(int n) {
		while(n > 0 && n % 3 == 0){
			n = n/3;
		}
		return n==1;
    }
}