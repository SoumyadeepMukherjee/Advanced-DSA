/**
 * Given an array ‘pages’ of integer numbers, where ‘pages[i]’ represents the number of pages in the ‘i-th’ book. There are ‘m’ number of students, and the task is to allocate all the books to their students. 

Allocate books in a way such that:

1. Each student gets at least one book.

2. Each book should be allocated to a student.

3. Book allocation should be in a contiguous manner.

You have to allocate the books to ‘m’ students such that the maximum number of pages assigned to a student is minimum.

Please try to solve this problem on your own before moving on to further discussion here.

Let’s understand the problem statement through an example.

Example: 
Number of books = 4 and Number of students = 2

pages[] = { 10,20,30,40}

Important points to consider
Assign at least one book to every student, so there can’t be any allocation such that a student gets no books assigned.
While allocating the books, no book should be left out. In other words, you have to allocate each and every book given.
Allocate in a contiguous manner. Let's say you have to allocate 3 books to a student from pages[] = { 10,20,30,40}
 

Then, the possible allocations can be - {10,20,30} and {20,30,40}. You can’t allocate {10,30,40} as it is not contiguous.

All possible ways of book allocation are shown in the below figure-

The minimum of the maximum number of pages assigned = min{90,70,60} = 60. Hence, the required answer is 60.
 */
import java.util.*;
public class Book_allocation {
    public static boolean Possible(int[] arr, int n, int m,int key) {
        int pageSum=0,studentCount=1;
        for(int i=0;i<n;i++)
        {
            if(pageSum<=key)
            pageSum+=arr[i];
            else
            {
                studentCount++;
                if(studentCount>m || arr[i]>key )
                return false;
                pageSum=arr[i];
            }
            
        }
        return true;
    }
    public static int allocation(int[] arr, int n, int m)
    {
        int s=0,e=0,mid=0;
        for(int i=0;i<n;i++)
        {
            e+=arr[i];
        }
        mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e)
        {
            if(Possible(arr,n,m,mid))
            {
                ans=mid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(allocation(arr,n,m)); 
    }
}
