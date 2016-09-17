public class Solution{

	public static void main(String[] args) {
		System.out.println(new Solution().convertToTitle(52));
	}

	private static final int BASE  =26;

	public String convertToTitle(int n) {
		if(n == 0){
			return "";
		}
        StringBuilder builder = new StringBuilder();
        while(n > 0){
        	n--;
        	char ch = (char)(n % BASE + 'A');
        	n /= BASE;
        	builder.append(ch);
        }
        return builder.reverse().toString();
    }

}