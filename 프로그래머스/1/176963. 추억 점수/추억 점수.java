import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> score = new HashMap<>();
        int[] answer = new int[photo.length];
        
        for(int i=0; i<answer.length; i++) answer[i] = 0;
        for(int i=0; i<yearning.length; i++) {
            score.put(name[i], yearning[i]);
        }
        for(int i=0; i<photo.length; i++) {
            for(int j=0; j<photo[i].length; j++) {
                if(score.containsKey(photo[i][j])) answer[i] += score.get(photo[i][j]);
                // for(Map.Entry<String, Integer> m : score.entrySet()) {
                //     if(photo[i][j].equals(m.getKey())) {
                //         answer[i] += m.getValue();
                //     }
                // }
            }
        }
        return answer;
    }
}