import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> burger = new Stack<>();
        
        for(int i : ingredient) {
            
            burger.push(i);
            
            if(burger.size() >= 4) { // burger.size()가 4이상일때부터 재료 테스트!!
                // burger.get(burger.size()-4) ... -> 제일 마지막 4개검사!! -> 스택 이용
                if( burger.get(burger.size()-4) == 1 && burger.get(burger.size()-3) == 2 
                   && burger.get(burger.size()-2) == 3 && burger.get(burger.size()-1) == 1) {
                
                    answer++;
                    for(int j=0; j<4; j++) burger.pop();
                }
            }
        }
        return answer;
    }
}