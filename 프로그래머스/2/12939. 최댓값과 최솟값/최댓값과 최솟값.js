function solution(s) {
    let answer = '';
    s = s.split(" ");
    let arr = []
    for(let i=0; i<s.length; i++) {
        arr.push(Number(s[i]));
    }
    arr.sort((a, b) => a-b);    
    return arr[0] + " " + arr[arr.length-1];
}