public class Solution{
	public static void main(String[] args) {
		String[] words = {"a","ab","abc","d","cd","bcd","abcd"};
		Solution s = new Solution();
		s.sort(words, 0, words.length-1);
		for(int i=0;i<words.length;i++){
			System.out.println(words[i]);
		}
		System.out.println(s.maxProduct(words));
	}

	public int maxProduct(String[] words) {
        if(words == null || words.length == 0){
        	return 0;
        }
        int max = 0;
        int len = words.length-1;
        sort(words, 0, len-1);
        for(int i=len;i>=0;i--){
			for(int j = i-1;j>=0;j--){
				if(!hasCommon(words[i], words[j])){
					max = Math.max(words[i].length() * words[j].length(), max);
				}
			}
        }
        return max;
    }

    public void sort(String[] words, int l, int r){
    	if(l < r){
    		int start = l;
    		int end = r;
    		int pivot = words[r].length();
    		while(start < end){
    			while(start < end && words[start].length() < pivot) start++;
    			while(start < end && words[end].length() >= pivot) end--;
    			swap(words, start, end);
    		}
    		swap(words, start, r);
    		sort(words, l, start-1);
    		sort(words, start+1, r);
    	}
    }

    public void swap(String[] words, int i, int j){
    	String temp = words[i];
    	words[i] = words[j];
    	words[j] = temp;
    }

    public boolean hasCommon(String s, String t){
    	int[] arr = new int[26];
    	int lenS = s.length();
    	int lenT = t.length();

    	for(int i=0;i<lenS;i++){
    		arr[s.charAt(i) - 'a']++;
    	}

    	for(int i=0;i<lenT;i++){
    		if(arr[t.charAt(i) - 'a'] > 0){
    			return true;
    		}
    	}
    	return false;
    }
}