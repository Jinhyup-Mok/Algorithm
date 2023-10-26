#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int N;           // 돌의 개수
	int DP[1000];    // 게임과정의 횟수

	cin >> N;

	DP[0] = 0;
	DP[1] = 1;
	DP[2] = 2;

	for (int i = 3; i <= N; i++) {
		DP[i] = min(DP[i - 1] + 1, DP[i - 3] + 1);
	}

	if (DP[N] % 2 == 1) {
		cout << "SK";
	}
	else {
		cout << "CY";
	}

	return 0;
}