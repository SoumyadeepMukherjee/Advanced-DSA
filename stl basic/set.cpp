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
{  // set store elemene in sorted order
  // set<datatype or container> variable;
  // internal impleme red black tree
  set<string> s; 

  // insert
  s.insert("abc"); // log(n) operation
  s.insert("zsdf");
  s.insert("bcd");
  auto it=s.find("abc"); // find return iterator 
 if(it !=s.end()) // always check for segmenetation fault
  {
    cout<<(*it)<<endl;
    s.erase(it);
    s.erase("bcd");
  }
 print(s);



 // unordered_set me order matter nahi karta bus element hai ya nhi chekc karta





}
