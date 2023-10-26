function solution(d, budget) {
    let answer = 0;
    d.sort((a,b) => a-b);
    let i = 0;
    while(d[i] <= budget) {
        answer++;
        budget -= d[i];
        i++
        
    }
    return answer;
}