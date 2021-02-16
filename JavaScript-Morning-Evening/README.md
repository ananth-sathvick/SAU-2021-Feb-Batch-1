# Javascript Assignment

## 1. Slide 52
```javascript
var add = (function() {
    var counter = 0;
    return function() {
        counter += 1;
        console.log(counter);
        return counter;
    }
})();

add();
add();
add();
add();
```
### Self-Invoking Functions - prerequisite
Function expressions can be made "self-invoking".

A self-invoking expression is invoked (started) automatically, without being called.

Function expressions will execute automatically if the expression is followed by ().

You cannot self-invoke a function declaration.

You have to add parentheses around the function to indicate that it is a function expression.

### Function closure

The variable add is assigned to the return value of a self-invoking function.

The self-invoking function only runs once. It sets the counter to zero (0), and returns a function expression.

This way add becomes a function, add can access the counter in the parent scope.

It makes it possible for a function to have "private" variables.

The counter is protected by the scope of the anonymous function, and can only be changed using the add function.
***
## 2. Array Methods
\- Run 2.js to view all the array method implementations
```javascript
node 2.js
```
(_view comments for expected output_)
***

## 3. Regex
```
Create a function which takes input as a string and it returns true if
a) String starts with lion
b) String ends with cat
c) String has abc (b can be n>=1 times) anywhere in between the string.
And also print the location of a/b/c if true or else return false.
```

```javascript
node 3.js
```

```javascript
Output - 
indices of a
[ 6, 10, 17 ]
indices of b
[ 9 ]
indices of c
[ 5, 12 ]
true
true
true
false

```
***

## 4. Array Manipulation
```
Create a function which takes array as an input
a) Sort array in ascending order
b) Multiply each number by 10
c) Return those numbers which are divisible by 3
```
```javascript
node 4.js
```
```javascript
Output - 

Array after sorting = 1,2,3,4,5,6
Array after *10 = 10,20,30,40,50,60
[ 30, 60 ]
```
***
## 5. Difference between '==' and '==='




| ==       | ===           |
| ------------- |-------------|
| == in JavaScript is used for comparing two variables, but it ignores the datatype of variable.      | === is used for comparing two variables, but this operator also checks datatype and compares two values.right-aligned |
| Checks the equality of two operands without considering their type.      | Compares equality of two operands with their types.      |
| Return true if the two operands are equal. It will return false if the two operands are not equal. | It returns true only if both values and data types are the same for the two variables.      |
| == make type correction based upon values of variables.| 	=== takes type of variable in consideration. |
|The == checks for equality only after doing necessary conversations.|If two variable values are not similar, then === will not perform any conversion.|

___
___

```javascript
node 5.js
```
```javascript
Output - 
"5" == 5 => true
"5" === 5 => false
5 == 5 => true
5 === 5 => true
```
***