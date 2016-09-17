
public class Solution{

	public static void main(String[] args) {
		System.out.println(new Solution().findDifference("abcd", "abcde"));
	}

	public char findDifference(String s, String t){
		char[] arr = new char[26];
		int len1 = s.length();
		int len2 = t.length();
		char result = ' ';
		for(int i=0;i<len2;i++){
			arr[t.charAt(i) - 'a']++;
		}
		for(int i=0;i<len1;i++){
			arr[s.charAt(i) - 'a']--;
		}
		for(int i=0;i<26;i++){
			if(arr[i] > 0){
				result = (char)(i + 'a');
				break;
			}
		}
		return result;
	}
}