The logic behind finding the longest common subsequence is:

1) We create a table of dimension (n+1)*(m+1) where n and m are the lengths of string 'A' and 'B' respectively. We can consider the rows as the elements o string A, and columns as the elements of string B. 
The first row and the first column are filled with zeros.

2)Then each cell of the table is filled using the following logic:
	If the character corresponding to the current row of string 'A' and current column of string 'B'are matching, then we increase the length of the previous LCS(which was the diagonal element just above,ie, previous row and column) by 1, so we fill the current cell by adding one to the diagonal element of the previous row and column. 
	Else, we cannot increase the LCS length, so we take the maximum value from the previous column and previous row element for filling the current cell.

3)Step 2 is repeated until the table is filled.

The value in the last row and the last column is the length of the longest common subsequence.