#include<bits/stdc++.h>
using namespace std;

int mod = 5381;
vector<int> stringMatch(string &str, string &pat) {
    
    int n = str.size();
    int m = pat.size();
    int hp = 1;
    
    for(int i = 0; i < m-1; i++) {
        hp = (hp*26)%mod;
    }
    
    int hash1 = 0;
    int hash2 = 0;
    for(int i = 0; i < m; i++) {
        hash1 = (hash1*26 + pat[i])%mod;
        hash2 = (hash2*26 + str[i])%mod;
    }
    
    vector<int> ans;
    int j = 0;
    for(int i = 0; i <= n-m; i++) {
        if(hash1 == hash2) {
            for(j = 0; j < m; j++) {
                if(str[i+j] != pat[j]) {
                    break;
                }
            }
            if(j == m) {
                ans.push_back(i);
            }
        }
        
        if(i < n-m) {
            hash2 = (26*(hash2 - str[i]*hp) + str[i+m])%mod;
            if(hash2 < 0) {
                hash2 += 5381;
            }
        }
    }
    return ans;
}

int main() {

    string str;
    string pat;
    cin>>str;
    cin>>pat;

    vector<int> ans = stringMatch(str, pat);

    for(int i = 0; i < ans.size(); i++) {
        cout<< ans[i] <<" ";
    } 
    cout<<endl;

    return 0;
}
