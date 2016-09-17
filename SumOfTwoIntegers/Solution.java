
public class Solution{

	public static void main(String[] args) {
		System.out.println(new Solution().getSum(5, 7));
	}

	public int getSum(int a, int b){
		while(a != 0){
			int tmp = (a & b) << 1;
			b = a ^ b;
			a = tmp;
		}
		return b;
	}

}