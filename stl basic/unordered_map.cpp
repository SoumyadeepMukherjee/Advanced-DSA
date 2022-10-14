#include<bits/stdc++.h>
using namespace std;
int main()
{
	int tc;
	cin>>tc;
	while(tc--)
	{
         int n;
         int count=0;
         cin>>n;
         int l,r;
         cin>>l>>r;

         int h[n];
         for(int i=0;i<n;i++)
         {
         	cin>>h[i];
         }
         int i=0,j=n-1;
         //sort(h,h+n);
         while(i<=j)
         	{
              int diff=abs(h[j]-h[i]);
              if(diff>l and diff<=r)
              {
              	count++;
              	i++;
              	j--;
              }
              else if(diff > l and diff>r)
              {
                  j--;
              }
              else
              {
                i++;
              }
         	}
         	cout<<count<<endl;

	}
	return 0;
}
