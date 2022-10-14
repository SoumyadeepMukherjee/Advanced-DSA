#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	queue<string> q;
	while(n--)
	{ string s;
		cin>>s;
		q.push(s);
	}

	while(!q.empty())
	{
		cout<<q.front()<<endl;
		q.pop();
	}
}
