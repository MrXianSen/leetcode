public class Solution{
	public static void main(String[] args) {
		String s = "I am a student.";
		System.out.println(new Solution().reverseWords(s));
	}

	public String reverseWords(String s) {
        if(s == null || s.length() == 0){
        	return "";
        }
        char[] arr = s.toCharArray();
        int len = s.length();
        for(int i=0;i<len;i++){
        	int j = i;
        	while(i < len && arr[i] != ' '){
        		i++;
        	}
        	reverse(arr, j, i-1);
        }
        reverse(arr, 0, len-1);
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<len;i++){
        	builder.append(arr[i]);
        }
        return builder.toString();
    }

    public void reverse(char[] arr, int start, int end){
    	while(start < end){
    		swap(arr, start, end);
    		start++;
    		end--;
    	}
    }

    public void swap(char[] arr, int i, int j){
		char tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}