import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>();
        for(int i=0; i<players.length; i++) {
            rank.put(players[i], i);
        }
        for(String player : callings) {
            int a = rank.get(player);
            String call = players[a-1];
            players[a-1] = player;
            players[a] = call;
            
            rank.put(player, a-1);
            rank.put(call, a);
        }
        return players;
    }
}