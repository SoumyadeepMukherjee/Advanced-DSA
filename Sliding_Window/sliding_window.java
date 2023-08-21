package Sliding_Window;
//finding the largest sum of k consecutive numbers using the concept of sliding window
import java.util.*;
import java.io.*;
import java.lang.*;
public class sliding_window {

    public static int sum_n_elements(Vector<Integer> ar, int k)
    {
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<ar.size()-k+1;i++)
        {
            int currsum = 0;
            for(int j=0;j<k;j++)
            {
                currsum += ar.elementAt(i+j);
                maxsum = Math.max(currsum,maxsum);
            }
        }
        return maxsum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        Vector<Integer> ar = new Vector<Integer>(n);
        System.out.println("Enter any " + n + "elements: ");
        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();
            ar.add(num);
        }
        System.out.println("Enter the number of consecutive integers required to calculate the sum: ");
        int no = sc.nextInt();
        if(no > n)
        {
            throw new IllegalArgumentException ("Invalid Input! The no of integers exceed the number entered");
        }
        else
        {
            int sum = sum_n_elements(ar, no);
            System.out.println("Largest sum = " + sum);
        }
        sc.close();
    }
}
