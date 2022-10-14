#include<bits/stdc++.h>
using namespace std;
int main()
{
	int tc;	int  N;
    cin>>N;

	string t = "tea";
	string c = "coffee";
	string b = "beer";
		string s;
		getline(cin, s);
		size_t found;
		
	vector<string> v[N]; // array of N vector with size 0 can be used as 2d array 
    for(int i=0;i<N;i++)
    {
    	
      		string s;
    		getline(cin,s);
    		v[i].push_back(s);

    }
    for(int i=0;i<N;i++)
    	{
    		for(int j=0;j<v[i].size();j++)
    		{
    			//cout<<v[i][j]<<" ";
    			 if(found = v[i][j].find(t))
    			 { if(found=v)
    			 	cout<<"SERVE TEA";
    			 }
    			 else if(found = v[i][j].find(c))
    			 {

    			 }
    			 else if(found = v[i][j].find(b))
    			 {

    			 }
    			
    		} cout<<endl;
    	} 
      
}

