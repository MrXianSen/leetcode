public class Solution{
	public static void main(String[] args) {
		int m = 3;
		int n = 3;
		Solution s = new Solution();
		System.out.println(s.uniquePaths(m, n));
	}

	public int uniquePaths(int m, int n) {
		if(n == 0 || m == 0) return 0;
		if(m == 1 || n == 1) return 1;
        int[][] steps = new int[m][n];
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		steps[i][j] = 1;
        	}
        }
        for(int i=1;i<m;i++){
        	for(int j=1;j<n;j++){
        		steps[i][j] = steps[i-1][j] + steps[i][j-1];
        	}
        }
        return steps[m-1][n-1];
    }
}