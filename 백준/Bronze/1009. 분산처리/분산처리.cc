#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    
    unsigned int nums, a, b, output;
    
	scanf("%d", &nums);

    for (int i = 0; i < nums; ++i)
    {
        output = 1;

        scanf("%d %d", &a, &b);

        for (int j = 0; j < b; ++j)
        {
            output = (output * a) % 10;
        }

        if (output == 0)
        {
            output = 10;
        }
        
        printf("%d\n", output);
    }
}