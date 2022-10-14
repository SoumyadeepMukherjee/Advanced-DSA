#include<bits/stdc++.h>
using namespace std;
void pattern(int n)
{
	if(n==0)
	{ 
	   
	}
	
	for(int i=n;i>=1;--i)
	{
		cout<<i<<" ";
	}
	cout<<endl;
	pattern(n-1);


}
int main()
{
	int n;
	cin>>n;
	pattern(n);
	

}
