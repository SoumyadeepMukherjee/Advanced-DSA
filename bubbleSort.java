public class bubbleSort {
    
    public static void main (String args[]){

        int arr[]={1,13,7,2,5};

        for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
        for(int i=0;i<=arr.length-1;i++){
        System.out.println(arr[i]);
        }
    }
}
