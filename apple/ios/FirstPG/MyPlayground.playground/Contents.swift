import UIKit

print("Hello World!")

var number1:Int64 = 1
//let result:Int64 = number1 + 10 - This is wrong, constants does NOT need type modifiers
let result = number1 + 12
print("My result = \(result)")

var int = 1;
int += 1
print("My  Int = \(int)")

var double = 10 % 3
print("My double = \(double)")

var name = "Chittaranjan"
print("My name is \(name)")

// --->
let range = 11
switch range {
case 11, 12, 13, 14, 15, 16, 20:
    print("Greater than 10")
//    break
case 1...10:
    print("Less than 11")
    break
case 50:
    print("50 is here")
default:
    print("In default")
}

// --->
let myName  = "Chittaranjan"
if name == "Sardar" {
    print("Hi Sardar")
}else if name == "chittaranjan"{
    print("You should not be here")
}else if name == "Chittaranjan"{
    print("Hi Chittaranjan")
}

