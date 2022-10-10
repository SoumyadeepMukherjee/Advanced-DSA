//Given a string s, find the length of the longest substring without repeating characters

//Leetcode Medium problem-https://leetcode.com/problems/longest-substring-without-repeating-characters/


class Solution 
{
public:
    int lengthOfLongestSubstring(string s) 
    {
        int i=0;
        int j=0,mx=0;
        unordered_map<char,int>mp;
        while(j<s.size())
        {
            mp[s[j]]++;
            if(mp.size()==j-i+1)
            {
                mx=max(mx,j-i+1);
                j++;
            }
            else if(mp.size()<j-i+1)
            {
                while(mp.size()<j-i+1)
                {
                    mp[s[i]]--;
                    if(mp[s[i]]==0)
                        mp.erase(s[i]);
                    i++;
                }
                j++;
            }
        }
        return mx;
    }
};
