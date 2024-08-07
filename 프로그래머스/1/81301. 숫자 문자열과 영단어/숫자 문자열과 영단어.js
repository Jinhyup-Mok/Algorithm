// - Object.keys()
// - Array.prototype.forEach()
// - String.prototype.replaceAll()
function solution(s) {
    const dict = {
        zero: 0,
        one: 1,
        two: 2,
        three: 3,
        four: 4,
        five: 5,
        six: 6,
        seven: 7,
        eight: 8,
        nine: 9
    };
    
    Object.keys(dict).forEach(item => s = s.replaceAll(item, dict[item])); 
    // ["zero", "one", ...]
    return +s;
}