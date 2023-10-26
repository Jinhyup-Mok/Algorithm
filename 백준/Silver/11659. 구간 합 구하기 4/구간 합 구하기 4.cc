#include <iostream>
#include <vector>
using namespace std;
int main() {
    ios::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);

    int n, m;
    cin >> n >> m;

    vector<long> sum(n+1);
    sum[0] = 0; 

    for(int i=1; i<n+1; i++) {
        long num;
        cin >> num;
        sum[i] = sum[i-1] + num;
    }
    int a, b;
    for(int i=0; i<m; i++) {
        cin >> a >> b;
        cout << sum[b] - sum[a-1] << "\n";
    }
}