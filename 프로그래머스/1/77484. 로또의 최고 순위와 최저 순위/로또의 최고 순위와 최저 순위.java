class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt1 = 0;
        int cnt2 = 0;
        int[] answer = new int[2];
        for(int i=0; i<lottos.length; i++) {
            for(int j=0; j<win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) cnt1++;
            }
            if (lottos[i] == 0) {
                cnt2++;
            }
        }
        if(cnt1 == 0 && cnt2 == 0) {
            answer[0] = 6;
            answer[1] = 6;
        } else if(cnt1 == 0 || cnt1 == 1) {
            answer[0] = 7-(cnt1+cnt2);
            answer[1] = 6;
        } else {
            answer[0] = 7-(cnt1+cnt2);
            answer[1] = 7- cnt1;
        }
        return answer;
    }
}