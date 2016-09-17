/**
 * Divide two integers without multiplication, division, and mod operation
 */
public class Solution{
	public static void main(String[] args) {
		System.out.println(new Solution().divide(-2147483648, -2));
	}

	public int divide(int dividend, int divisor) {
		boolean sign = false;
		if(divisor == 1) return dividend;
		 if(divisor < 0) return -divide(dividend, -divisor);
		 if(dividend < 0) return -divide(-dividend, divisor);
		 if(divisor > dividend) return 0;
		 if(divisor == 0) return Integer.MAX_VALUE;
		 long d = divisor;
		 long bitcnt = 1;
		 long ans = 0;
		 while(d < dividend ){
			 d <<= 1;
			 bitcnt <<= 1;
		 }
		 while(d >= divisor){
			 while(dividend >= d){
				 dividend -= d;
				 ans += bitcnt;
			 }
			 d >>= 1;
			 bitcnt >>= 1;
		 }
		 return (int)ans;
    }
}