package AmazonCoding;
import java.util.*;

public class CheckSumOfPairs {
    public static void main(String[] args) {
        int arr[] = {5,7,1,2,4,8,3};
        int n = 10;

        System.out.println("Pairs exist: " + (findPairs(arr,n) ? "Yes" : "No"));
    }

    public static boolean findPairs(int[] arr, int n) {
        HashSet<Integer> hp = new HashSet<>();

        for(int i = 0; i < arr.length; i++){

            if(hp.contains(n - arr[i])){
                return true;
            }

            hp.add(arr[i]);
            System.out.println(hp);
        }

        return false;
    }
}
