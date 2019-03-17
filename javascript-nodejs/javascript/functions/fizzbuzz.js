
function isDivisibleBy3(number){

    return number%3 == 0? true : false;
}


function isDivisibleBy5(number){

    return number%5 == 0? true : false;
}

let number = 100;
for(let i =1; i<number; i++){

    if(isDivisibleBy3(i) && isDivisibleBy5(i)){
        
        console.log('FizzBuzz');

    } else if(isDivisibleBy3(i)){

        console.log("Fizz");

    }else if(isDivisibleBy5(i)){

        console.log("Buzz");
    
    }else{

        console.log(i);
    }
}