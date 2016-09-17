
public class Solution{

	public static void main(String[] args) {
		System.out.println(new Solution().reverse1(1534236469));
	}

	public int reverse(int x) {
        boolean isNegative = false;
        if(x < 0){
        	isNegative = true;
        	x = -x;
        }
        String str = String.valueOf(x);
        StringBuilder builder = new StringBuilder(str);
        if(isNegative){
        	builder.append("-");
        }
        return Integer.parseInt(builder.reverse().toString());
    }

    public int reverse1(int x){
    	boolean isNegative = false;
    	if(x < 0){
    		x = -x;
    		isNegative = true;
    	}
    	int result = 0;
    	while(x > 0){
    		result = result * 10 + (x % 10);
    		x = x/10;
    	}
    	if(isNegative){
    		return -result;
    	}else{
    		return result;
    	}
    }
}