#include<bits/stdc++.h>
using namespace std;

void print_v(vector<int> &v)

{ cout<<"size  :"<<v.size()<<endl;
	for(int i=0;i<v.size();++i)
	{
		//cout<<v[i].first<<" "<<v[i].second<<endl;
	  cout<<v[i]<<" ";
	}
	cout<<endl;
}

void array_of_vector()
{ int  N;
    cin>>N;
	
	vector<int> v[N]; // array of N vector with size 0 can be used as 2d array 
    for(int i=0;i<N;i++)
    {
    	int n; // size of vector i
    	cin>>n;
    	// input for ith vector 
    	for(int j=0;j<n;++j)
    	{
    		int x;
    		cin>>x;
    		v[i].push_back(x);
    	}
    }
      // print array of vector
     for(int i=0;i<N;i++)
    {
    	for(int j=0;j<v[i].size();j++)
    	{
    		cout<<v[i][j]<<" ";
    	} cout<<endl;
    } 

}

void vector_of_vector()
{ int N;
	cin>>N;
	// VECTOR OF VECTOR 
	vector<vector<int>> v;
	for(int i=0;i<N;i++)
	{
		int n;
		cin>>n;
		vector<int> temp;
		for(int j=0;j<n;j++)
		{
			int x;
			cin>>x;
			temp.push_back(x);
		}
		v.push_back(temp);
		
	}
	v[0].push_back(10);
	 for(int i=0;i<v.size();i++)
	 {
	 	print_v(v[i]);
	 }

}

int main()
{ 


//array_of_vector();
vector_of_vector();


// vector of pair...har ek vecotr ka element 2 element store karega pair ka
	
	//vector<pair<int,int>> v;
	//v={{1,2},{2,4},{4,16},{16,32}};

	// input taking
	//int n;
	//cin>>n;
	/*for(int i=0;i<n;i++)
	{
		int x,y;
		cin>>x>>y;
		v.push_back({x,y});
		//v.push_back(make_pair(x,y));
	}

   // print
	//swap(v[1],v[3]);
	print_v(v); 
	*/




}
