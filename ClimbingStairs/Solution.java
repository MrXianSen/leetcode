public class Solution{
	public static void main(String[] args) {
		System.out.println(new Solution().climbStairs(1));
	}

	public int climbStairs(int n) {
        if(n == 1 || n == 0){
        	return n;
        }
        int a = 1;
        int b = 1;
        for(int i=1;i<n;i++){
        	int temp = b;
        	b = a + b;
        	a = temp;
        }
        return b;
    }
}