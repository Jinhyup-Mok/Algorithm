#include <iostream>
#include <vector>
using namespace std;

int gcd(int x, int y) {
	if (y == 0) return x;
	return gcd(y, x % y);
}

int vecsize;
vector<int> vec;
int tmp;

int ans = 1;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	while (cin >> tmp) vec.emplace_back(tmp);
	vecsize = vec.size();

	for (int i = 0; i < vecsize; i++) {
		for (int j = i + 1; j < vecsize; j++) {
			ans = max(ans, gcd(vec[i], vec[j]));
		}
	}

	cout << ans;
}