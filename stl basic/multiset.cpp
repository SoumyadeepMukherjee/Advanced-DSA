#include<bits/stdc++.h>
using namespace std;
void print(multiset<string> &s)
{
  for(auto ps:s)
  {
    cout<<ps<<" ";
  } cout<<endl;
}
int main()
{
	// multiset allow multiple value 
    // alternate of priority_queue
	multiset<string> s;
	s.insert("abc"); // log n operation
	s.insert("zsdf");
	s.insert("bcd");
	s.insert("abc");
	print(s);
auto it=s.find("abc"); //log n
if(it!=s.end())
{
	s.erase(it); // delete value at it only 
	//s.erase("abc"); // delete all value from set
}
print(s);

}
