import java.util.*;

class Solution {
    public List solution(int[] arr, int divisor) {
        
        List<Integer> answer = new ArrayList<>();
        
        for(int element : arr) if(element % divisor == 0) answer.add(element);
        
        if(answer.size() == 0) answer.add(-1);
        else Collections.sort(answer);
        
        return answer;
    }
}