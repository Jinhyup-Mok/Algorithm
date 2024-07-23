class Solution {
    public int solution(double num) {
        int cnt = 0;
        
        if (num == 1) return 0;
        while(num != 1 && cnt < 500) {
            if(num % 2 == 0) num /= 2;
            else if(num % 2 != 0) num = (num * 3) + 1;
            cnt++;
        }
        
        if(num != 1) return -1;
        
        return cnt;
    }
}