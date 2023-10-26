#include <iostream>

#define MAX 1001
using namespace std;

int n;
int dp[MAX];
int num[MAX];

int main() {
    cin >> n;
    for(int i=1; i<=n; i++) {
        cin >> num[i];
    }
    int max = 0;
    for(int i=n; i>0; i--) {
        dp[i] = 1;
        for(int j=n; j>=i; j--) {
            if (num[i] > num[j] && dp[i] < dp[j] + 1) {
                dp[i] = dp[j] + 1;
            }
        }
        if(max < dp[i]) max = dp[i];
    }
    cout << max << "\n";
}
