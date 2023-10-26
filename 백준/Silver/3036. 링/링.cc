#include <iostream>
using namespace std;

int gcd(int a, int b) {
    if(b == 0) {
        return a;
    }
    return gcd(b, a % b);
}

int main() {
    int t;
    cin >> t;

    int r[t];

    for(int i=0; i<t; i++) {
        cin >> r[i];
    }

    for(int i=1; i<t; i++) {
        int n = gcd(r[0], r[i]);
        cout << r[0] / n << "/" << r[i] / n << "\n";
    }
}