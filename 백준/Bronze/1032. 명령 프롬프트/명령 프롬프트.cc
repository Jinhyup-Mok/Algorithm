#include <iostream>
#include <queue>
#include <tuple>
#include<vector>
#include<string.h>
#include<algorithm>
#include<cstring>
#include<stdlib.h>
#include<string>
using namespace std;

int main() {
    ios::sync_with_stdio(false); cin.tie(nullptr); cout.tie(nullptr);

    int N;
    cin >> N;
    string saveStr="";
    for (int i = 0; i < N; i++) {

        string str;
        cin >> str;
        if (i == 0) {
            saveStr = str;
        }
        else {
            for (int j = 0; j < str.size(); j++) {
                if (saveStr[j] != str[j]) {
                    saveStr[j] = '?';
                }
            }
        }
    }
    cout << saveStr << "\n";

}