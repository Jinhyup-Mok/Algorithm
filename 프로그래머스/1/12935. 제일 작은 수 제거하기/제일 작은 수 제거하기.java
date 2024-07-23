import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        
        if(arr.length > 1) {
            int min = Arrays.stream(arr).min().getAsInt();
            answer = Arrays.stream(arr).filter(factor -> factor != min).toArray();
        }
        
        return answer;
    }
}