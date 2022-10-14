#include<bits/stdc++.h>
using namespace std;
//void print_v(vector<int> &v)
void print_v(vector<string> &v)

{ cout<<"size  :"<<v.size()<<endl;
	for(int i=0;i<v.size();i++)
	{
		cout<<v[i]<<" ";
	}
	cout<<endl;
}


int main()
{
	// vector is dynamic array

  //  declare -> vector<datatype> variable;
	//vector<int> v;
	vector<string> v;
	//vector<int> v(5,3); // vector of size 5 filled with 3
   // print_v(v);
	int n;
	cin>>n;
	// input element
	for(int i=0;i<n;i++)
	{
		//int x;
		string x;
		cin>>x;
		v.push_back(x);
	}
	print_v(v);

	// pop_back() --> delete last element;
	v.pop_back();
	print_v(v);


// u can copy vector to other vector but it will take O(N) time
//vector<int> &v1=v; // reference to v not copy of v
//v1.pop_back();
//print_v(v1);
//print_v(v);




}