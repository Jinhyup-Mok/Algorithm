#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int n, m;
    cin >> n >> m;

    int pakage[m];
    int single[m];
    long price = 0;

    for(int i=0; i<m; i++) {
        cin >> pakage[i] >> single[i];
    }
    sort(pakage, pakage+m); // <algorithm> 헤더 정렬함수 : sort(배열의 포인터, 배열의 포인터 + 배열의 크기)
    sort(single, single+m);

    if(n > 6) {
        while(n > 6) {
            n = n - 6;
            price += min(pakage[0], single[0]*6);
        }
        price += min(pakage[0], single[0]*n);

    } else {
        price += min(pakage[0], single[0]*n);
    }
    cout << price << "\n";
}