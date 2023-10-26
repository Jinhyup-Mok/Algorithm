//
// Created by mokjh on 2023-03-22.
//
#include <iostream>

using namespace std;

long sum[100001];
long dp[1025][1025];
int n, m;

int main() {

    cin >> n >> m;

    int num;
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=n; j++) {
            cin >> num;
            dp[i][j] = dp[i][j-1] + num;
        }
    }
    int x1, y1, x2, y2;
    for(int i=1; i<=m; i++) {
        cin >> x1 >> y1 >> x2 >> y2;
        for(int j=x1; j<=x2; j++) {
            sum[i] += (dp[j][y2]-dp[j][y1-1]);
        }
    }
    for(int i=1; i<=m; i++) {
        cout << sum[i] << "\n";
    }
}
