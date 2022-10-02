/**
 * pivot_element
 */
//Time Complexity: O(log(n))
import java.util.*;
public class pivot_element {

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) 
        {arr[i]=sc.nextInt();}
        System.out.println(pivot(arr));
        sc.close();
    }
}