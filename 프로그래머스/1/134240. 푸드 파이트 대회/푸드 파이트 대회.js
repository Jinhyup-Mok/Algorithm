function solution(food) {
    let answer = [0];
    let result = "";
    for(let i=food.length-1; i>0; i--) {
        for(let j=0; j<Math.floor(food[i]/2); j++) {
            answer.unshift(i);
            answer.push(i);
        }
    }
    for(let i=0; i<answer.length; i++) {
        result += answer[i];
    }
    return result;
}