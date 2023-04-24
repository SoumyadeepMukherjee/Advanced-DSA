#include<bits/stdc++.h>
using namespace std;
int count(int arr[], int n, int l, int r)
{
	int count = 0; 

	for (int i = 0; i < n; i++)
	{
      
		for (int j = i+1; j < n; j++)
		{  int diff=abs(arr[i]-arr[j]);
			if (diff > l && diff <= r)
				{ //cout<<arr[i]<<arr[j]<<endl;
					count++;
				}
		}
	}
	return count;
}

int main()
{
	int tc;
	cin >> tc;
	while (tc--)
	{
		int n;
		cin >> n;
		int l, r;
		cin >> l >> r;

		int h[n];
		for (int i = 0; i < n; i++)
		{
			cin >> h[i];
		}

		cout <<count(h, n, l, r)<<endl;
	}
	return 0;
}
