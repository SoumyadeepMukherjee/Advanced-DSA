#include<bits/stdc++.h>
using namespace std;
int main()
{
	map<int,string> m;
	m[1]="abc"; // O(log(n)) operation
	m[5]="cdc";
	m[3]="acd";
	m[5]="abe";
	m.insert({4,"afg"});
	// printing 
/*	for(auto pr:m)
	{
		cout<<pr.first<<" "<<pr.second<<endl;
	}
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    
    // find 
    auto it=m.find(5);
 // finding and taking care of corer case
    if(it==m.end())
    {
    	cout<<"No value";
    }
    else
    {
    	cout<<it->first<<" "<<it->second<<endl;
    }
    // erase 
    if(it!=m.end())
    {
    	 m.erase(it);
    }


    // clear will clear map
   
   */ m.clear();
    for(auto pr:m)
    {
    	cout<<pr.first<<endl;
    }
   
}
