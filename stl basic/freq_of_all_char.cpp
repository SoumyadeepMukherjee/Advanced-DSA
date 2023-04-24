#include<bits/stdc++.h>
using namespace std;
int main()
{
	
	string s;
	//cin.ignore();
	getline(cin,s);
	int freq[255]={0};
	for(int i=0;i<s[i];i++)
	{
		freq[(s[i])]++;

	}
	for(int i=0;s[i];i++)
	{
		if(freq[(s[i])])
		{
	      cout<<s[i]<<" :"<<freq[s[i]]<<endl;
	      freq[s[i]]=0;
		}
		
	}






}
