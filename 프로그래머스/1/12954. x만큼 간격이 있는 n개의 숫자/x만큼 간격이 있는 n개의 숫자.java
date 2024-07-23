import java.util.*;
class Solution {
    public List solution(long x, int n) {
        
        List<Long> answer = new ArrayList<>();
        
        if (x > 0) {
            for(long i=x; i<=x*n; i+=x) answer.add(i);
        } else if (x < 0) {
            for(long i=x; i>=x*n; i+=x) answer.add(i);
        } else {
            for(long i=x; i<n; i++) answer.add(x);
        }
        return answer;
    }
}

// return LongStream.iterate(x, i->i+x).limit(n).toArray();