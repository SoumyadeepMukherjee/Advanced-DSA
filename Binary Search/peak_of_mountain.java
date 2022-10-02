import java.util.*;
public class peak_of_mountain {
    public static int peak(int[] arr) {
        int s=0,e=arr.length-1,mid=s+(e-s)/2;
        while(s<e)
        {
            if(arr[mid]<arr[mid+1])
            s=mid+1;
            else if(arr[mid]>arr[mid+1])
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
        System.out.println(peak(arr));
        sc.close();
    }
}
