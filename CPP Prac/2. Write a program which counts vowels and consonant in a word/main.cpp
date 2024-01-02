#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
	string str;
	cout << "Enter a string: ";
	cin >> str;
	
	transform(str.begin(), str.end(), str.begin(), ::tolower);
	
	int counter;
	for (int i = 0; i<str.length(); i++) {
		 counter =1;
		for (int j = 0; j< i; j++) {
			if (str[i] == str[j]) {
				counter = 0;
			}
		}
		if (counter != 0) {
			counter = 1;
			for(int k=i+1; k<str.length(); k++) {
				if (str[i] == str[k]) {
					counter++;
				}
			}
			cout << str[i] << " : " << counter <<endl;
		}
	}
	return 0;
	
}