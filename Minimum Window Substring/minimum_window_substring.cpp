#include <iostream>
#include <string>
#include <unordered_map>
using namespace std;


/*

76. Minimum Window Substring


Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

A substring is a contiguous sequence of characters within the string.

*/


class Solution {
public:
    string minWindow(string s, string t) {
        
        // creating two unordered_maps to store element:frequency of main string 's' and substring 't'
        unordered_map <char,int> map1;
        unordered_map <char,int> map2;
        
        //creating the frequency map of the given window substring
        for (int i=0;i<t.length();i++){
            map1[t[i]]++;
            
        }
        /*
            initialising:
            -->two integers to be used in two pointer approach: i=-1 and j=-1
            -->n=main string length
            -->m=window subtring length
            -->desired_match_count=t.length() i.e. window subtring length
            -->initial match_count=0;
            -->empty string answer to be returned by the function
        
        */
        int i=-1,j=-1,n=s.length(),m=t.length();
        int match_count=0;
        int desired_match_count=t.length();
        string answer="";
        
        while (true){
            
            //two flag conditions for two while loops
            bool flag1=false,flag2=false;
            /*
                Increasing the length of the string by adding characters from the i index upto which all required
                characters are included from the window subtring to the main string
            
            */
            while (match_count<desired_match_count && i<n-1){

                    i++;
                    
                    char x=s[i];
                    map2[x]++;
                    if ( map2[x]<=map1[x]){
                        match_count++;
                    }
                    flag1=true;
                   
            }
            /*
                Decreasing the length of the string by removing characters from the j index until a required character is
                is removed and the match_count becomes less than desired_match_count 
            
            */
            while (j<i&& match_count==desired_match_count){
                //Capturing the substring at which the above loop broke 
                string curr=s.substr(j+1,i-j);
                // Comparing the string with the answer string to find which is longer
                if (answer.length()==0 || curr.length()<answer.length()){
                    answer=curr;
                }
                
                j++;
                map2[s[j]]--;
                
                if (map2[s[j]]<map1[s[j]]){
                        match_count--;
                }
                flag2=true;
            }
            //function terminates when both the while conditions remain false
            if (flag1==false && flag2==false) return answer;
        }
        
        return answer;
    }
};