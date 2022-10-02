//Finding square root using binary search technique with acute precision
//Time complexity:O(log(n))

import java.util.*;
public class square_root {
    public static int squareroot(int[] arr) {
        int s=0,e=arr.length-1,mid=s+(e-s)/2;
        int ans=0;
        while(s<=e)
        {
            int square=arr[mid]*arr[mid];
            if(square==arr[arr.length-1])
            return arr[mid];
            else if(square<arr[arr.length-1])
            {ans=arr[mid];
            s=mid+1;
            }
            else
            {
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }
    // public static float precision(float sq,int n,int p) {
    //     float ans=0;
    //     float square=sq*sq;
    //     float pre=1;
    //     for(int i=1;i<=p;i++)
    //     {
    //         pre/=10;
    //         System.out.print(pre+" ");
    //         while(square!=0)
    //         {
    //             if(square<n)
    //             {
    //                 ans=sq+pre;
    //                 sq=sq+pre;
    //                 square=sq*sq;
    //             }
    //             else
    //             break;
    //         }
    //         System.out.println(ans);
    //     }
    //     return ans;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // int p=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        int sq=squareroot(arr);
        // if(sq*sq==n)
        System.out.println(sq);
        // else
        // System.out.println(precision(sq,n,p));
        // System.out.println(5.1+0.01);
        sc.close();
    }
}
