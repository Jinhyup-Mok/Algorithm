#include <iostream>
using namespace std;
int main() {
	ios::sync_with_stdio(NULL);
	cin.tie(NULL);
	double r1, r2, r3;
	cin >> r1 >> r2 >> r3;
	cout.setf(ios::fixed);
	cout.precision(10);
	cout << (r1 * r2 * r3) / (r1 * r2 + r1 * r3 + r2 * r3);
}