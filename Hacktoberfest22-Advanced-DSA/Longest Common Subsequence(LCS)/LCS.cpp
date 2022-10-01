#include<bits/stdc++.h>
using namespace std;

//Longest Common Subsequence between 2 strings

int LCS(string a, string b, int n, int m)
{
    vector<vector<int>> dp(n+1, vector<int> (m+1,0));
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=m;j++)
        {
            if(a[i-1]==b[j-1])
            {
                dp[i][j]=dp[i-1][j-1]+1;
            }
            else
            {
                dp[i][j]=max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }
    return dp[n][m];
}

int main()
{
    int n,m;//size of 2 strings
    cin>>n>>m;
    string a,b;
    cin>>a>>b;//2 strings
    int ans=LCS(a,b,n,m);
    cout<<ans<<endl;
    return 0;
}