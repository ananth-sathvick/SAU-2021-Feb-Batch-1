// concat() - get students name from 
var girls = ["Chaithra", "Ahalya"];
var boys = ["Vatsa", "Ananth", "Ajit"];
var class_ = girls.concat(boys);
console.log(class_);
//[ 'Chaithra', 'Ahalya', 'Vatsa', 'Ananth', 'Ajit' ]

console.log();
console.log("every() - check for even numbers");
var nums = [2, 4, 34, 74, 58];
console.log(nums.every((num) => {
    if (num % 2 == 0) {
        return true;
    } else {
        return false;
    }
}));
//true

console.log();
console.log("filter() - get people above the age of 18");
var ages = [18, 15, 17, 21, 28, 13, 23];
var above_18 = ages.filter((age) =>
    age >= 18
);
console.log(above_18);
//[ 18, 21, 28, 23 ]

console.log();
console.log("forEach() - print squares of numbers");
var nums = [1, 2, 3, 4];
var squares = [];
nums.forEach((num) => squares.push(num * num));
console.log(squares);
//[ 1, 4, 9, 16 ]

console.log();
console.log("indexOf() - find the first position of a number");
var nums = [45, 34, 35, 12, 54, 45];
console.log(nums.indexOf(12));
// 3
console.log(nums.indexOf(21));
// -1 (not found)

console.log();
console.log("join() - join different parts of name to get full name");
var name = ['Mr', 'Ananth', 'Sathvick'];
console.log(name.join(' '));
// Mr Ananth Sathvick
console.log(name.join());
// Mr,Ananth,Sathvick
console.log(name.join('-'));
// Mr-Ananth-Sathvick

console.log();
console.log("lastIndexOf() - find position of last occourance of a number");
var nums = [45, 34, 35, 12, 54, 45];
console.log(nums.lastIndexOf(45));
// 5
console.log(nums.lastIndexOf(405));
// -1 (not found)

console.log();
console.log("map() - get uppercase of all the name");
var names = ["abcD", "aBc", "Abcd", "aaa"];
var uppercase = names.map(x => x.toUpperCase());
console.log(uppercase);
// [ 'ABCD', 'ABC', 'ABCD', 'AAA' ]


console.log();
console.log("pop() - remove insertion mistakes from array");
var fruits = ["apple", "banana", "watermelon", "carrot", "bottle gaurd"];
console.log(fruits.pop());
//bottle gaurd
console.log(fruits);
// [ 'apple', 'banana', 'watermelon', 'carrot' ]
console.log(fruits.pop());
// carrot
console.log(fruits);
// [ 'apple', 'banana', 'watermelon' ]

console.log();
console.log("push() - insert a fruit in the fruits array");
console.log(fruits);
//[ 'apple', 'banana', 'watermelon' ]
fruits.push("pineapple");
console.log(fruits);
// [ 'apple', 'banana', 'watermelon', 'pineapple' ]

console.log();
console.log("reduce() - subtract all elements of the array from left to right");
var nums = [1, 2, 3, 4];
var added = nums.reduce((accumulator, currentValue) => accumulator - currentValue);
console.log(added);
//-8

console.log();
console.log("reduceRight() - subtract all elements of the array from right to left");
var nums = [1, 2, 3, 4];
var added = nums.reduceRight((accumulator, currentValue) => accumulator - currentValue);
console.log(added);
//-2

console.log();
console.log("reverse() - get the descending order of a ascending array");
var nums = [1, 2, 3, 4];
var desc = nums.reverse();
console.log(desc);
//[ 4, 3, 2, 1 ]

console.log();
console.log("shift() - remove the first element from numbers");
var nums = [1, 2, 4, 8];
var fir = nums.shift();
console.log(nums);
// [ 2, 4, 8 ]
console.log(fir);
// 1


console.log();
console.log("slice() - get animals from particular to index (start) to end index (excluded)");
var animals = ['ant', 'bison', 'camel', 'duck', 'elephant'];
console.log(animals.slice(2));
// ["camel", "duck", "elephant"]
console.log(animals.slice(2, 4));
// ["camel", "duck"]
console.log(animals.slice(1, 5));
// ["bison", "camel", "duck", "elephant"]

console.log();
console.log("some() - test if array contains atleast one positive element");
var nums = [-43, -12, -34, -54, -9, 98];
console.log(nums.some((num) => num >= 0));
//true

console.log();
console.log("toSource() - get the source code of array - [Dep]");
var alpha = new Array('a', 'b', 'c');
// console.log(alpha.toSource());
// ['a', 'b', 'c']

console.log();
console.log("sort() - sort names of students in ascending order");
var students = ['Chaithra', 'Ahalya', 'Vatsa', 'Ananth', 'Ajit'];
var sorted = students.sort();
console.log(sorted);

console.log();
console.log("splice() - Correct the months in the array");
var months = ['Jan', 'March', 'April', 'June'];
months.splice(1, 0, 'Feb'); // -  inserts at index 1
console.log(months);
// ["Jan", "Feb", "March", "April", "June"]
months.splice(4, 1, 'May'); // - replaces 1 element at index 4
console.log(months);
// ["Jan", "Feb", "March", "April", "May"]

console.log();
console.log("toString() - returns the name of all students seperated with comma");
var nums = ['Chaithra', 'Ahalya', 'Vatsa', 'Ananth', 'Ajit'];
var to_str = nums.toString();
console.log(to_str);
//Chaithra,Ahalya,Vatsa,Ananth,Ajit

console.log();
console.log("unshift() - add elements to the begining of the array");
var nums = [3, 4, 5];
console.log(nums.unshift(1, 2)); // - (return the lenght of the array) 5
console.log(nums);
// [1, 2, 3, 4, 5]