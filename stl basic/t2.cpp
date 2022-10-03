#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    int k;
    cin>>k;
    sort(a,a+n);
    int f=0,b=n-1;
    while(f<=b)
    { 
         if(a[f]+a[b]==k){
             cout<<f<<","<<b<<endl;
             f++;
             b--;
         }
        if(a[f]+a[b]>k)
        {
            b--;
        }
        else
        {
            f++;
        }
    }
}