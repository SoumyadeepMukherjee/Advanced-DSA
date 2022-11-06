import java.util.*;

// Question 1 
// Median of Two Sorted Arrays
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] mergedArray = new int[nums1.length + nums2.length];
    int n = mergedArray.length;
    int median = 0;
    float ans = 0;
    
    int pos = 0;
    for (int element : nums1) //copying elements of secondArray using for-each loop
    {
    mergedArray[pos] = element;
    pos++; //increases position by 1
    }
    for (int element : nums2) //copying elements of firstArray using for-each loop
    {
    mergedArray[pos] = element;
    pos++;
    }
    Arrays.sort(mergedArray);
    if(mergedArray.length % 2 != 0){
    median = mergedArray.length/2;
    ans = mergedArray[median];
    }
    else {
    median = mergedArray.length/2;
    ans = mergedArray[median] + mergedArray[median - 1] ;
    ans /= 2;
    }
    return ans;
    }
    }

    // Question 2 
    // The Skyline Problem
    //A city's skyline is the outer contour of the silhouette formed by all the buildings in that city when viewed 
    //from a distance. Given the locations and heights of all the buildings, return the skyline formed by these buildings collectively.

    class Solution2 {
        public List<List<Integer>> getSkyline(int[][] buildings) {
             int[][] heights = new int[2*buildings.length][2];
             for(int i=0;i<buildings.length;i++){
                 heights[2*i] = new int[]{buildings[i][0], -buildings[i][2]};
                 heights[2*i+1] = new int[]{buildings[i][1], buildings[i][2]};
             }
             
             Arrays.sort(heights, (a,b)->(a[0]!=b[0])?(a[0]-b[0]):(a[1]-b[1]));
             
             PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
             pq.add(0);
             int prevMax = 0;
             
             List<List<Integer>> res = new ArrayList<>();
             for(int[] height:heights){
                 if(height[1]<0){
                     pq.add(Math.abs(height[1]));
                 }else{
                     pq.remove(height[1]);
                 }
                 int curr = pq.peek();
                 if(curr!=prevMax){
                     res.add(List.of(height[0], curr));
                     prevMax = curr;
                 }
             }
             return res;
         }
     }

     // Question 3
     //First Missing Positive
     //Given an unsorted integer array nums, return the smallest missing positive integer.
     //You must implement an algorithm that runs in O(n) time and uses constant extra space.

     class Solution3 {
        public int firstMissingPositive(int[] nums) {
            int miss=1;
            Arrays.sort(nums);
            int n=nums.length;
            for(int i=0;i<n;i++){
                if(nums[i]>miss)
                    return miss;
                if(nums[i]==miss)
                    miss++;
            }
            return miss;
        }
    }
     // Question 4
    // Burst Balloons
    //     You are given n balloons, indexed from 0 to n - 1. Each balloon is painted with a number on it represented by an array nums. You are asked to burst all the balloons.
    // If you burst the ith balloon, you will get nums[i - 1] * nums[i] * nums[i + 1] coins. If i - 1 or i + 1 goes out of bounds of the array, then treat it as if there is a balloon with a 1 painted on it.
    // Return the maximum coins you can collect by bursting the balloons wisely.

    class Solution4 {
        public int maxCoins(int[] nums) {
            int n = nums.length;
            int N = n+2;
            
            int[] newNums = new int[N];
            newNums[0] = 1;
            newNums[n+1] = 1;
            
            for (int i = 1; i < N -1; i++)
                newNums[i] = nums[i-1];
            
            int[][] dp = new int[N][N];
            
          
            
            for (int row = N - 2; row >= 0; row--){ //bottom up
                for (int col = row+2; col <= N - 1; col++){ //left to right, top of diagonal
                    for (int k = row+1; k < col; k++){ //
                        dp[row][col] = Math.max(dp[row][col], dp[row][k]+dp[k][col]+newNums[k]*newNums[row]*newNums[col]);
                    }
                }
            }
            return dp[0][N-1];
            
        }
    }

    // Question 5
    //Max Points on a Line
    //Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, 
    //return the maximum number of points that lie on the same straight line.

    class Solution5 {
        public int maxPoints(int[][] points) {
           
            if (points.length == 1) return 1; // edge case
            Map<Slope, Integer> map = new HashMap<>();
            List<int[]> processed = new ArrayList<>();
            int res = 0;
            for (int[] point : points) {
                Set<Slope> preCal = new HashSet<>();
                for (int[] prePoint : processed) {
                    Slope slope = calSlope(point, prePoint);
                    if (preCal.contains(slope)) continue; 
                    preCal.add(slope);
                    
                    int cnt = map.getOrDefault(slope, 1) + 1; 
                    map.put(slope, cnt);
                    res = Math.max(res, cnt);
                }
                processed.add(point);
            }
            
            return res;
        }
        
        public Slope calSlope(int[] point, int[] prePoint) {
          
            int x1 = point[0], y1 = point[1], x2 = prePoint[0], y2 = prePoint[1];
            int preA = y1 - y2, preB = x2 - x1, preC = y2 * x1 - y1 * x2; 
            int gcd = gcd(preA, preB);
            gcd = gcd(gcd, preC);
            if (gcd == 0) gcd = 1; 
            int A = preA / gcd, B = preB / gcd, C = preC / gcd; 
            if ((A < 0 && B >= 0) || (A < 0 && B <= 0)) { 
                A *= -1; B *= -1; C *= -1;
            }
            
            return new Slope(A, B, C);
        }
        
        class Slope {
            int A = 0;
            int B = 0;
            int C = 0;
            
            public Slope(int A, int B, int C) {
                this.A = A;
                this.B = B;
                this.C = C;
            }
            
            @Override
            public int hashCode() {
                int hash = 1;
                hash = 31 * hash + A;
                hash = 31 * hash + B;
                hash = 31 * hash + C;
                return hash;
            }
            
            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null) return false;
                if (this.getClass() != o.getClass()) return false;
                Slope obj = (Slope) o;
                return this.A == obj.A && this.B == obj.B && this.C == obj.C;
            }
        }
        
        public int gcd(int a, int b) { 
            if (a == 0) return b;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }