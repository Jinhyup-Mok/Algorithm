#include <iostream>
using namespace std;
int main() {
    int H, M;
    int h, m;
    cin >> H >> M;
    if (M >= 45) {
        h = H;
        m = M - 45;
    }
    else if (M < 45) {
        h = H - 1;
        m = (M - 45) + 60;
        if (H == 0) h = 23;
    }
    cout << h << " ";
    cout << m << endl;
}