function solution(price, money, count) {
    let sum = 0;
    for(let i=1; i<=count; i++) {
        let a = price * i;
        sum += a;
    }

    return sum - money <= 0 ? 0 : sum - money;
}