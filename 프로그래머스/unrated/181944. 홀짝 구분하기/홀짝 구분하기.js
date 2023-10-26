const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});



rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    n = String(input[0]);
    console.log(n % 2 == 0 ? `${n} is even` : `${n} is odd`);
});