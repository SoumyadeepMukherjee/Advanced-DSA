/**
 * Median_of_two_sorted_arrays
 */
public class Median_of_two_sorted_arrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a= nums1;
        int[] b= nums2;
         if(a.length>b.length)
        {
            return findMedianSortedArrays(b,a);
        }
        int Alen = a.length;
        int Blen = b.length;
        int total = Alen + Blen;
        int half = total/2;
        int l=0,r=a.length,Aleft=0,Aright=0,Bleft=0,Bright=0;
        double result =0;
        while(true){
            int i = l+(r-l)/2;//mid of a
            int j = half-i;//remaining elements from half in b
            if((i-1)>=0)
            Aleft = a[i-1];
            else
            Aleft = Integer.MIN_VALUE;
            if((i)<Alen)
            Aright = a[i];
            else
            Aright = Integer.MAX_VALUE;
            if((j-1)>=0)
            Bleft = b[j-1];
            else
            Bleft = Integer.MIN_VALUE;
            if((j)<Blen)
            Bright = b[j];
            else
            Bright = Integer.MAX_VALUE;
            if(Aleft<=Bright && Bleft<=Aright)
            {
                if(total%2==0)
                {
                    result = (double)(Math.max(Aleft,Bleft)+Math.min(Aright,Bright))/2;
                }
                else
                    result = Math.min(Aright,Bright);
                break;
            }
            else if(Aleft>Bright)
                r=i-1;
            else
                l=i+1;
            
        }
    return result;
    }
    public static void main(String[] args) {
        Median_of_two_sorted_arrays obj = new Median_of_two_sorted_arrays();
        int[] a = {1,2};
        int[] b = {3,4};
        obj.findMedianSortedArrays(a,b);
    }
}