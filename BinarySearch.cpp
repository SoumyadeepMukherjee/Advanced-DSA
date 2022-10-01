  int binarysearch(int arr[], int n, int k) {
        // code here
        int low=0,high=n-1;
        
        while(low<=high)
        {int mid=(low+high)/2;
            if(k==arr[mid])
            return mid;
            else if(k<arr[mid])
            {
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return -1;
    }