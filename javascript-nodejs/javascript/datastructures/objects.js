
// let myObject = {

//     firstName : 'Hari',
//     lastName : 'Ohm',
//     attributes : ['Creator', 'Maitainer', 'Destructor']
// }

// console.log('First Name = ' + myObject.firstName);
// console.log('Has LastName = ' + ('lastName' in myObject));
// console.log('attributes = ' + myObject['attributes']);
// console.log('Yetnotdefined = ' + myObject.capabiliy);
// myObject.capabiliy = 'Beyond Imagination';
// console.log('Capability = ' + myObject.capabiliy);
// console.log('All attributes = ' + Object.keys(myObject));


// let myObject2 = {canNotDo:'Yet not defined!'};
// Object.assign(myObject2, myObject);

// console.log(myObject2);


let objOne = {
    name : 'Chittaranjan',
    qualifications : []
}

objOne.console = ['Java', 'Algo', 'Design Patterns']

objOne.console.forEach(element => {
    console.log(element)
});

console.log("Length = " + objOne.qualifications.length) // 