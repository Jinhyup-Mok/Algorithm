function solution(s){
    let answer = true;
    let arr = [];
    if(s[0] === ')' || s[s.length-1] === '(') { answer = false }
    else {
        for(let i=0; i<s.length; i++) {
            if(s[i] === '(') arr.push(s[i]);
            else arr.pop();
        }
        if(arr.length === 0) answer = true;
        else answer = false;
    }
    
    return answer;
}