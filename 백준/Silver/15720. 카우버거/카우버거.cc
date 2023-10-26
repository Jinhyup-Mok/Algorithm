#include <iostream>

#include <vector>

#include <algorithm>

#include <functional>

using namespace std;

 

const int MAX = 1000 + 1;

 

int B, C, D;

vector<int> burger, side, beverage;

 

void discount(void)

{

        int sum = 0;

        sort(burger.begin(), burger.end(), greater<int>()); //내림차순 정렬

        sort(side.begin(), side.end(), greater<int>()); //내림차순 정렬

        sort(beverage.begin(), beverage.end(), greater<int>()); //내림 차순 정렬

 

        int setNum = min(burger.size(), min(side.size(), beverage.size()));

 

        for (int i = 0; i < setNum; i++)

        {

                 sum += burger[i] * 0.9;

                 sum += side[i] * 0.9;

                 sum += beverage[i] * 0.9;

        }

 

        //나머지는 정상가

        for (int i = setNum; i < burger.size(); i++)

                 sum += burger[i];

        for (int i = setNum; i < side.size(); i++)

                 sum += side[i];

        for (int i = setNum; i < beverage.size(); i++)

                 sum += beverage[i];

 

        cout << sum << endl;

}

 

int main(void)

{

        cin >> B >> C >> D;

 

        int sum = 0;

        //버거 정상가격

        for (int i = 0; i < B; i++)

        {

                 int price;

                 cin >> price;

                 burger.push_back(price);

                 sum += price;

        }

        //사이드 메뉴 정상가격

        for (int i = 0; i < C; i++)

        {

                 int price;

                 cin >> price;

                 side.push_back(price);

                 sum += price;

        }

        //음료 정상가격

        for (int i = 0; i < D; i++)

        {

                 int price;

                 cin >> price;

                 beverage.push_back(price);

                 sum += price;

        }

 

        cout << sum << endl; //정상가격

        discount();

 

        return 0;

}