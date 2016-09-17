import java.util.Arrays;
public class Solution{
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";

		System.out.println(new Solution().isAnagram(s, t));
	}

	public boolean isAnagram(String s, String t){
		if(s == null || t == null){
			return false;
		}
		int lens = s.length();
		int lent = s.length();
		if(lens != lent){
			return false;
		}
		char [] arrS = s.toCharArray();
		char [] arrT = t.toCharArray();
		Arrays.sort(arrS);
		Arrays.sort(arrT);
		for(int i=0;i<lens;i++){
			if(arrS[i] != arrT[i]){
				return false;
			}
		}
		return true;
	}
}