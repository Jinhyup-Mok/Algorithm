#include <iostream>
#include <algorithm>
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
    for(int i=1; i<=n; i++) {
        dp[i] = num[i];
        for(int j=1; j<=i; j++) {
            if(num[i] > num[j] && dp[i] < dp[j]+num[i]) {
                dp[i] = dp[j] + num[i];
            }
        }
        if(max < dp[i]) max = dp[i];
    }
    cout << max << "\n";

}