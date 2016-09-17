public class Solution{

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(new Solution().reverseString(s));
	}

	public String reverseString(String s){
		if(s == null || s.length() == 0){
			return "";
		}
		int len = s.length();
		char[] arr = s.toCharArray();
		int i = 0;
		int j = len-1;
		while(i < j){
			swap(arr, i, j);
			i++;
			j--;
		}
		StringBuilder builder = new StringBuilder();
		for(i=0;i<len;i++){
			builder.append(arr[i]);
		}
		return builder.toString();
	}

	public void swap(char[] arr, int i, int j){
		char tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}