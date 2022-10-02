package dynamicProgramming;

/**
 * Frog Jump Problem of Striver Sheet.
 * @author GUDDU 
 *
 */
public class FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		int[] height = {10, 20, 30, 10};
		
		int res = frogJump(n, height);
		
		System.out.println(res);
				

	}
	
	// Method to find the minimum cost.
	    public static int frogJump(int n, int heights[]) {

	        // Write your code here..
	        int[] dp = new int[n];
	        for(int i=0; i<n; i++){
	            dp[i] = -1;
	        }
	        
	        sol(n-1, dp, heights);
	        
	        return dp[n-1];
	        
	        
	        
	    }
	    
	    // dp solution
	    // Memoization approch
	    static int sol(int index, int[] dp, int[] heights){
	        
	        if(index == 0) return 0;
	        
	        if(dp[index] != -1) return dp[index];
	        
	        int left = sol(index-1, dp, heights) + Math.abs(heights[index] - heights[index-1]);
	        int right = Integer.MAX_VALUE;
	        if(index > 1){
	             right = sol(index-2, dp, heights) + Math.abs(heights[index] - heights[index-2]);
	        }
	        
	        return dp[index] = Math.min(left, right);
	        
	    }



}
