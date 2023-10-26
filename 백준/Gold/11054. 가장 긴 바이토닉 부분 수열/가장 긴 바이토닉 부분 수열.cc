#include <iostream>
#define max 1001
using namespace std;

int n;
int num[max];
int dp1[max];
int dp2[max];

int main() {
    cin >> n;

    for(int i=1; i<=n; i++) {
        cin >> num[i];
    }

    for(int i=1; i<=n; i++) {
        dp1[i] = 1;
        for(int j=1; j<=i; j++) {
            if(num[j] < num[i] && dp1[i] < dp1[j] + 1) {
                dp1[i] = dp1[j] + 1;
            }
        }
    }

    for(int i=n; i>=1; i--) {
        dp2[i] = 1;
        for(int j=n; j>=i; j--) {
            if(num[j] < num[i] && dp2[i] < dp2[j] + 1) {
                dp2[i] = dp2[j] + 1;
            }
        }
    }
    int answer = 0;
    for(int i=0; i<=n; i++) {
        if(answer < dp1[i] + dp2[i] - 1) answer = dp1[i] + dp2[i] - 1;
    }
    cout << answer << "\n";
}