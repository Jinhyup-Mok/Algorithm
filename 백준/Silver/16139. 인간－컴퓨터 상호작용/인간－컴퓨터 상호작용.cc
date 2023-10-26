#include <iostream>
using namespace std;

string arr;
int sum[27][200002];

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	cin >> arr;

	for (int i = 0; i < arr.size(); i++) {
		if(i!=0) {
			for (int j = 0; j < 26; j++) {
				sum[j][i] += sum[j][i - 1];
			}
		}
		sum[arr[i] - 'a'][i]++;
	}

	int N;
	cin >> N;
	for (int i = 0; i < N; i++) {
		char val;
		int str, end;
		cin >> val;
		cin >> str >> end;
		
		if (str == 0) {
			cout << sum[val - 'a'][end] << "\n";
		}
		else {
			cout << sum[val - 'a'][end] - sum[val - 'a'][str - 1] << "\n";
		}
	}
	return 0;
}