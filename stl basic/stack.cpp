#include<bits/stdc++.h>
using namespace std;
int main()
{  // stack is lifo
	// push()-> to insert element pop()-> to delete top element 
	// top-> to get top element
	int n;
	cin>>n;
	stack<int> s;
	while(n--)
	{ int x;
		cin>>x;
		s.push(x);
	}
while(!s.empty())
{
	cout<<s.top()<<" ";
	s.pop();
}

}
