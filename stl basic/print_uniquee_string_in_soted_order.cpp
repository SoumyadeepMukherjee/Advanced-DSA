#include<bits/stdc++.h>
using namespace std;
void print(set<string> &s)
{
  for(auto ps:s)
  {
    cout<<ps<<" ";
  } cout<<endl;
}
int main()
{
	int n;
	cin>>n;
	set<string> se;
	string s;
	for(int i=0;i<n;i++)
	{
		cin>>s;
		se.insert(s);
	}
	print(se);

}
