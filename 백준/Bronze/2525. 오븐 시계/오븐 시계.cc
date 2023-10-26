#include <iostream>
using namespace std;
int main() {
    int a, b, c;
    int h, m;
    cin >> a >> b;
    cin >> c;
    if (b+c < 60) {
        h = a;
        m = b+c;
    }
    else if ((b+c)/60 >= 1) {
        h = a + (b+c)/60;
        m = (b+c) - (60 * ((b+c)/60));
    }
    if (h > 23) h = h - 24;
    cout << h << " ";
    cout << m << endl;
}