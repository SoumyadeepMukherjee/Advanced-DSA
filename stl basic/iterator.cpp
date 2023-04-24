#include<bits/stdc++.h>
using namespace std;
int main()
{
	vector<int> v={2,3,5,7,8,9};
	for(int i=0;i<v.size();i++)
	{
		cout<<v[i]<<" ";
	}
	cout<<endl;
	vector<pair<int,int>>v_p={{2,4},{4,8},{8,16}};
	vector<pair<int,int>> :: iterator it;
	for (it=v_p.begin(); it!=v_p.end(); ++it)
	{
	  //cout<<(*it).first<<" "<<(*it).second<<endl;
	cout<<it->first<<" "<<it->second<<endl;
	
	}
	// range based for loop
	for(auto &value:v_p)
	{   
		cout<<value.first<<" "<<value.second<<endl;	
	}


	cout<<endl;


}
