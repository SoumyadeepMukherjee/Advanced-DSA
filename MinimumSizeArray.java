/**
* Minimum size Array problem of leetcode
* #Pr44
* Author Guddu
 */

public class MinimumSizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int target = 7;
		int[] nums = {2, 3, 1, 2, 4 ,3};
		
		System.out.println(minSubArrayLen(target, nums));
		
	}
	
	
	    public static int minSubArrayLen(int target, int[] nums) {
	        
	        int i=0; int j=0;
	        int n = nums.length;
	        
	        int sum = 0;
	        int res = Integer.MAX_VALUE;
	        
	        while(j < n){
	            while(sum < target && j < n)
	            {
	                sum += nums[j];
	                j++;
	            }
	            
	            while(sum >= target){
	                res = Math.min(res, j-i);
	                // System.out.println(i + " " + j);
	                sum -= nums[i];
	                i++;
	            }
	        }
	        
	        if(res == Integer.MAX_VALUE) return 0;
	        else return res;
	    }
	

}
