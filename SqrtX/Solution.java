public class Solution{
	public static void main(String[] args) {
		int x = 2147483647;
		System.out.println(new Solution().mySqrt(x));
	}

	public int mySqrt(int x) {
		if(x == 1 || x == 2){
			return 1;
		}
		return sqrtHelp(x, 0, x);
    }

    public int sqrtHelp(int x, int l, int r){
    	if(r - l == 1){
    		return l;
    	}
    	int mid = (r + l) / 2;
    	if(mid * mid > x){
    		return sqrtHelp(x, l, mid);
    	}else if(mid * mid < x){
    		return sqrtHelp(x, mid, r);
    	}else{
    		return mid;
    	}
    }
}