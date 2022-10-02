#include <bits/stdc++.h>
using namespace std;
const int N = 1e5 + 10;
vector<int> t[N];
int p[N];
void dfs(int v, int par = -1)
{
    p[v] = par;
    for (auto child : t[v])
    {
        if (child == par)
        {
            continue;
        }
        dfs(child, v);
    }
}
vector<int> path(int v)
{
    vector<int> ans;
    while (v != -1)
    {
        ans.push_back(v);
        v = p[v];
    }
    reverse(ans.begin(), ans.end());
    return ans;
}

int main()
{
    int n;
    cin >> n;
    for (int i = 0; i < n - 1; i++)
    {
        int x, y;
        cin >> x >> y;
        t[x].push_back(y);
        t[y].push_back(x);
    }
    dfs(1);
    int x, y;
    cin >> x >> y;
    vector<int> path_x = path(x);
    vector<int> path_y = path(y);
    int lca = -1;
    int max_size = min(path_y.size(), path_x.size());
    for (int i = 0; i < max_size; i++)
    {
        if (path_x[i] == path_y[i])
        {
            lca = path_x[i];
        }
        else
        {
            break;
        }
    }
    cout << lca << endl;

    return 0;
}
