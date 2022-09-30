import java.util.*;

public class LIS {
    //Time Complexity: O(n^2)
    //Space Complexity: O(n)
    public static int LISDP(int[] arr) {
        int maxLen = 0, n = arr.length;

        //dp[i] stores the length of LIS uptill (including) arr[i]
        int[] dp = new int[n];
        
        //Recurrence relation:
        //dp[i] = 1 + max( dp[j] ) where 0 < j < i and arr[j] < arr[i]; or
        //dp[i] = 1, if no such j exists.
        
        for (int i = 0; i < n; i++) {
            dp[i] = 1; 
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            
            maxLen = Math.max(maxLen, dp[i]);
        }
        
        return maxLen;
    }
    
    //Finds the smallest element in sorted list >= num
    //Same as lower_bound() func in c++
    
    //O(logn)
    private int lowerBound(int ele, ArrayList<Integer> sb){
        int r=sb.size(), l=0, mid;
        while(l<r){
            mid = l+(r-l)/2;
            if(sb.get(mid)>=ele){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return r;
    }
    
    //Time Complexity: O(nlogn)
    //Space Complexity: O(1)

    //VIMP NOTE: sb is not the actual LIS it only depicts the length of LIS 
    public int LISBinarySearch(int[] nums) {
        ArrayList<Integer> sb = new ArrayList<>();
        //Time Complexity = (n number of elements)*(logn for binary search) = O(nlogn)
        for(int ele: nums){
            int idx = lowerBound(ele, sb);
            if(idx == sb.size()){
                sb.add(ele);
            }else{
                sb.set(idx, ele);
            }
        }
        return sb.size();
    }
}
