function closureFunction(x){

    return num => num*x; // it is returning s function (num) => {return num*x;}
}

let fun1 = closureFunction(2);
let fun2 = closureFunction(3);


console.log('Function one = ' + fun1(5));
// 10 
console.log('Function two = ' + fun2(5));
// 15 = Because every call of function has it's own copy of scope variables


//////////////////// Very Very Interesting ////////////////////
let num = 10;

function closureTwo(){

    return n => n*num;
}

let fun3 = closureTwo();
num = 20;
let fun4 = closureTwo();

console.log('Function Three = ' + fun3(2));
// 40
console.log('Function Four = ' + fun3(2));
// 40