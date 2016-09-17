public class Solution{
	public static void main(String[] args) {
		
	}

	public int minPathSum(int[][] grid) {
        int rows = grid.length;
        if(rows == 0) return 0;
        int columns = grid[0].length;
        int[][] dp = new int[rows][columns];
        for(int i=0;i<rows;i++){
        	for(int j=0;j<columns;j++){
        		if(i == 0 && j == 0){
        			dp[i][j] = grid[0][0];
        		}else if(i == 0){
        			dp[i][j] = dp[i][j-1] + grid[i][j];
        		}else if(j == 0){
        			dp[i][j] = dp[i-1][j] + grid[i][j];
        		}else{
        			dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
        		}
        	}
        }
        return dp[rows-1][columns-1];
    }
}