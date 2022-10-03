

string minWindow(string s, string t) {
    
    //This result variable will store the string which we will return
    string result;

    //It will check if any of the two string is empty and return empty string result
    if(s.empty() || t.empty()){
        return result;
    }

    //These 2 unorders maps will store frequency of characters in t string and windows
    unordered_map<char, int> map;
    unordered_map<char, int> window;

    //It will update the frequency of each charater of string t int map;
    for(int i = 0; i < t.length(); i++){
        map[t[i]]++;
    }

    //variable to store minimum length of result string
    int minLength = INT_MAX;

    //counter
    int letterCounter = 0;
    
    for(int slow = 0, fast = 0; fast < s.length(); fast++){
        
        //This c variable will store each character of string s according to the fast pointer movement starting from 0
        char c = s[fast];

        //If current character of "s" is available in map that consists of string "t" characters
        if(map.find(c) != map.end()){
            //store that character in current window and increase the counter by 1
            window[c]++;
            //This if condition will execute only if there is need to fulfill required charters from map to window and increase the letter counter
            if(window[c] <= map[c]){
                letterCounter++;
            }
        }

        //This condition we have found the result in current window
        if(letterCounter >= t.length()){
            while (map.find(s[slow]) == map.end() || window[s[slow]] > map[s[slow]])
            {
                //This will start decreasing frequency of extra character in window
                window[s[slow]]--;

                //and move slow pointer
                slow++;
            }

            //It will update the minimum required substring
            if(fast-slow + 1 < minLength){
                minLength = fast - slow + 1;
                //It will update the result string
                result = s.substr(slow, minLength);
            }
        }
    }
    return result;
}