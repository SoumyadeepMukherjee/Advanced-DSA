//Search an element in sorted and rotated array

//Time Complexity:O(log(n))

import java.util.*;
public class search_element_in_rotated_array {
    public static int pivot(int[] arr) {
        int s=0,e=arr.length-1,mid=s+(e-s)/2;
        while(s<e)
        {
            if(arr[mid]>arr[0])
            s=mid+1;
            else if(arr[mid]<arr[0])
            e=mid;
            mid=s+(e-s)/2;
        }
        return(e);
    }
    
    public static int binarysearch(int[] arr,int s,int e,int k) {
        int mid=s+(e-s)/2;
        while(s<=e)
        {
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]<k)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int piv=pivot(arr);
        if(k>=arr[0])
        {
            System.out.println(binarysearch(arr,0,piv-1,k));
        }
        else
        {
            System.out.println(binarysearch(arr,piv,arr.length-1,k));
        }
        sc.close();
    }
}
