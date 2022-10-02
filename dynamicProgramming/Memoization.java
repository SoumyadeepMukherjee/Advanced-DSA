package dynamicProgramming;

/**
 * Create a memo array to store the result.
 * optimise the recursive solution by creating memo array.
 * 0 1 1 2 3 5 8 
 *	@author GUDDU
 */

public class Memoization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fiboNum(6);

	}
	
	static void fiboNum(int n) {
		// memoization arrray.
		int memo[] = new int[n+1];
		// initialize the memo array with -1.
		for(int i=0; i<n+1; i++) {
			memo[i] = -1;
		}
		
		System.out.println(fib(n, memo));
	}
	
	// calculate fibonacci number 
	static int fib(int n, int[] memo) {
		
		if(memo[n] == -1) {
			int res;
			if(n == 0 || n== 1) {
				res = n;
			}else {
				res = fib(n-1, memo) + fib(n-2, memo);
			}
			
			memo[n] = res;
		}
		
		return memo[n];
	}

}
