#include<bits/stdc++.h>
using namespace std;
int main()
{
	int tc;
	cin>>tc;
	while(tc--)
	{
       long long n,k;
       cin>>n>>k;
       multiset<long long > s;

       for(long long i=0;i<n;i++)
       { long long t;
           cin>>t;
           s.insert(t);
       }

       long long total_candies=0;
       for(int i=0;i<k;i++)
       {
       	auto last=(--s.end());
       
       	long long candy_c=(*last);
       	total_candies+=candy_c;
       	s.erase(last);
       	s.insert(total_candies/2);

       }
       cout<<total_candies<<endl;

	}
	return 0;
}
