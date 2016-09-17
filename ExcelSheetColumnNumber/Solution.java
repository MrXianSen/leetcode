
public class Solution{

	public static final int BASE = 26;

	public static void main(String[] args) {
		System.out.println(new Solution().titleToNumber("AA"));
	}

	public int titleToNumber(String s) {
        if(s == null || s.length() == 0){
        	return 0;
        }
        int len = s.length();
        int result = 0;
        for(int i=0;i<len;i++){
        	char curr = s.charAt(i);
        	int index = 0;
        	result += (curr - 'A' + 1) * powOf26(len - 1 - i);
        }
        return result;
    }

    public int powOf26(int pow){
    	if(pow == 0){
    		return 1;
    	}
    	int result = 1;
    	int i = 0;
    	while(i<pow){
    		result *= BASE;
    		i++;
    	}
    	return result;
    }

}