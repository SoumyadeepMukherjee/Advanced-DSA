#include<bits/stdc++.h>
using namespace std;
int main()
{ /*
	//map<int,int> m; mormal map
    map<pair<int,int>,int> m; // nested
pair<int,int> p1,p2;
p1={2,4};
p2={2,3};
cout<<(p1>p2); // comapring kar sakte
// map,set,vector me bhi sorted order me store honge 
// jisko compare kar sakte use key bana le

-------------------------------------------------
 */

map<pair<string,string>,vector<int>> m;
int n;
cin>>n;
for(int i=0;i<n;i++)
{
	string fn,ln;
	int ct;
	cin>>fn>>ln>>ct;
	for(int j=0;j<ct;j++)
	{
       int x;
       cin>>x;
       m[{fn,ln}].push_back(x);
	}
}

for(auto &pr:m)
{
	auto &full_name=pr.first;
	auto &list=pr.second;
	cout<<full_name.first<<" "<<full_name.second<<endl;
	for(auto &element:list)
	{
		cout<<element<<" ";
	}
	cout<<endl;
}

}
