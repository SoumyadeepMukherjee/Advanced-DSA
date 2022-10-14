#include<bits/stdc++.h>
using namespace std;
int main()
{   
  // pair is used to maintain relation 
// pair<datatype1,datatype2> variable;
	pair<int,string> p;
  // p=make_pair(2,"abc");
   p={2,"abc"};
   pair<int,string> &p1=p; // p1 is same as p it means p1 is reference of p
	
  p1.first=5;
 //printing pair
	cout<<p.first<<" "<<p.second<<endl;
// array of pair
int a[]={1,2,3};
int b[]={2,3,4};

pair<int,int> p_Array[3];

p_Array[0]={1,2};
p_Array[1]={2,3};
p_Array[2]={3,4};
for(int i=0;i<3;i++)
{
	cout<<p_Array[i].first<<" "<<p_Array[i].second<<endl;
}




}
