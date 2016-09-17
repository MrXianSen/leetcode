public class Solution{
	public static void main(String[] args) {
		
	}

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int s = 0;
		if(m == 1 || n == 1) s = 1;
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
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		if(obstacleGrid[i][j] == 1){
        			if(i+1 == m-1 && j+1 == n-1){
        				return 0;
        			}else if(i+1==m-1 || j+1==n-1){
        				s -= steps[i][j];
        			}else{
        				s -= 2 * steps[i][j];
        			}
        		}
        	}
        }
        return s;
    }
}