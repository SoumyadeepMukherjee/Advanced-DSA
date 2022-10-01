//#include<bits/stdc++.h>
#include<iostream>
using namespace std;

bool binarySearch(int arr[], int n, int a) {
	int s = 0;
	int e = n-1;
	int mid;

	while(s<=e) {
		mid = s+(e-s)/2;

		if(mid == a) {
			return true;
		}
		else if(mid < a) {
			s = mid+1;
		}
		else {
			e = mid-1;
		}
	}
	return false;
}

int main() {
// ONLINE_JUDGE
#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);

	freopen("output.txt", "w", stdout);
#endif

	int n;
	cin >> n;

	int a;
	cin >> a;

	int arr[n];

	for(int i=0; i<n; i++) {
		cin >> arr[i];
	}

	if(binarySearch(arr, n, a)) {
		cout << "Element found" << endl;
	}
	else {
		cout << "Not found" << endl;
	}

	return 0;
}