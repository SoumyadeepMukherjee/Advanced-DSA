## Dynamic Programming Approach
**Recurrence Relation:**<br>
```
dp[i] = 1 + max( dp[j] ) where 0 < j < i and arr[j] < arr[i]; or
dp[i] = 1, if no such j exists.
```

**Time Complexity:** O(n^2)<br>
**Space Complexity:** O(n)

## Binary Search Approach
**LOGIC:**<br>
When we encounter an element(num) > than the last element in sb we obviously add it to sb as we increase the length of the present subsequence.<br>
Now when we encounter an element(num) <= the last element sb<br>
We find the first element in sb >= num say sb[idx] and replace it with num<br>
***WHY replace > element with num?*** because by doing so we increase our chance of making a longer increasing subsequence <br>
***HOW?*** all the elements following num in the arr which are > num <=sb[idx] now get a chance to form a subsequence <br>
which wont have happened if we hadnt replaced the sb[idx] with num only those numbers which are >= sb[idx] would be able to form subsequence not those numbers which are > and <= sb[idx]
numbers which are >= sb[idx] anyway get to form a subsequence since any number >= sb[idx] is obv > num <br>
therefore, replacing sb[idx] with num is a better choice than not replacing it<br>

Now, the question arises ***WHY*** replace = element with num <br>
This is because we want to find LIS definition is strictly increasing
if we replaced only > elements with num then sb would contain multiple occurences of the same number and we would have found longest non strictly increasing subsequence instead <br>
by replacing >= elements we ensure that sb contains only unique elements thereby ensuring that we get longest strictly increasing subsequence

**Time Complexity:** O(nlog(n))<br>
**Space Complexity:** O(1)
