
public class Solution{

	public int firstUniqChar(String s) {
    	if(s == null || s.length() == 0){
    		return -1;
    	}
    	int len = s.length();
    	int [] arr = new int[26];
    	for(int i=0;i<len;i++){
    		arr[s.charAt(i) - 'a']++;
    	}
    	for(int i=0;i<len;i++){
    		int index = s.charAt(i) - 'a';
    		if(arr[index] == 1){
    			return i;
    		}
    	}
    	return -1;
    }
}