/**
 * Functions as a variable declaration - 
 */

//myFunctionOne(); // This will create a runtime error - 'ReferenceError:', 
// as here function is declared as a variable
// we can not use a variable before it's declaration.

const myFunctionOne = function(){
    
    console.log("Har Har Mavadev!");
}

myFunctionOne();