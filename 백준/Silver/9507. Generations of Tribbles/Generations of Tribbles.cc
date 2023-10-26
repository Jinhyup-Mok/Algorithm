#include <iostream>

using namespace std;
typedef long long ll;

int main() {
	int t;
	cin >> t;
	int cnt = 0;
	int n = 0;
	ll koong[68] = {1, 1, 2, 4};
	for (int i = 4; i < 68; i++)
	{
		koong[i] = koong[i - 1] + koong[i - 2] + koong[i - 3] + koong[i - 4];
	}
	int* testCase = new int[t];
	for (int i = 0; i < t; i++)
	{
		cin >> testCase[i];
	}
	
	for (int i = 0; i < t; i++)
	{
		cout << koong[testCase[i]] << "\n";
	}
}