#include<bits/stdc++.h>
using namespace std;
int main()
{
	
	map<int,multiset<string>> m;
	int n;
	cin>>n;
	for(int i=0;i<n;i++)
	{
		int mark;
		string name;
		cin>>name>>mark;
		m[-1*mark].insert(name);

	}
	for(auto &it:m)
	{
		auto &stud=it.second;
		auto &marks=it.first;
		for(auto &student:stud)
		{
			cout<<student<<" "<<-1*marks<<endl;
		}
		
	}






}
