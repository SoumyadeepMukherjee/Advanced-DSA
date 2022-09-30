import java.util.*;
class LargestDaC
{
    public int find(int a[], int l, int u)
    {
        if(l==u)
            return a[l];
        else
        {
            int mid=(l+u)/2;
        
            int left=find(a,l,mid);
            int right=find(a,mid+1,u);
            if(left>right)
                return left;
            else
                return right;
        }
    }  
}
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the datas");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        LargestDaC obj=new LargestDaC();
        int s=obj.find(a, 0, n-1);
        System.out.println(s);
    }
}
