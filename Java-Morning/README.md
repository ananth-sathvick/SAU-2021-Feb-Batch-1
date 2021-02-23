# Java Assignment
## In-slide questions
1. Write a Java program to print the result of the following operations.
```java
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
```

`Slide_1.java`

Output - 
```java
a. 43
b. 1
c. 19
d. 13
```

2. Write a Java program to print an American flag on the screen.

`Slide_2.java`

Output - 
```java
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
==============================================
==============================================
==============================================
==============================================
==============================================
==============================================
```


## Hands on questions
1. String <br>
	Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.

	`Aissgnment_1.java`

	Output - 
	```java
	Enter the string
	Here there ere is being replaced bere       
	Enter the substring to be replaced 
	ere
	Enter the replacement text 
	mat
	After replacing substring ere with mat
	Hmat thmat mat is being replaced bmat
	```
2. Collection <br>
	Write a Java program to get a reverse order view of the keys contained in a given map.

	`Assignment_2.java`

	Output - 
	```java
	Orginal Map content: {Stud1=Ananth, Stud2=Pearson, Stud3=Miller, Stud4=John Doe}
	Reverse order view of the keys: [Stud4, Stud3, Stud2, Stud1]
	```
3. Exception <br>
	Write your own unchecked Exception and throw it from you counter programme which counts 1 to 100.When you get Prime no while counting then throw this Exception and catch this to print you exception message.

	`Assignment_3.java`

	Output - 
	```java
	1
	You have encountered an prime number 2
	You have encountered an prime number 3
	4
	You have encountered an prime number 5
	6
	You have encountered an prime number 7
	8
	9
	10
	You have encountered an prime number 11
	12
	You have encountered an prime number 13
	14
	15
	16
	You have encountered an prime number 17
	18
	You have encountered an prime number 19
	20
	21
	22
	You have encountered an prime number 23
	24
	25
	26
	27
	28
	You have encountered an prime number 29
	30
	You have encountered an prime number 31
	32
	33
	34
	35
	36
	You have encountered an prime number 37
	38
	39
	40
	You have encountered an prime number 41
	42
	You have encountered an prime number 43
	44
	45
	46
	You have encountered an prime number 47
	48
	49
	50
	51
	52
	You have encountered an prime number 53
	54
	55
	56
	57
	58
	You have encountered an prime number 59
	60
	You have encountered an prime number 61
	62
	63
	64
	65
	66
	You have encountered an prime number 67
	68
	69
	70
	You have encountered an prime number 71
	72
	You have encountered an prime number 73
	74
	75
	76
	77
	78
	You have encountered an prime number 79
	80
	81
	82
	You have encountered an prime number 83
	84
	85
	86
	87
	88
	You have encountered an prime number 89
	90
	91
	92
	93
	94
	95
	96
	You have encountered an prime number 97
	98
	99
	100
	```
4. Serialization <br>
	Write a programme to serialize 3 fields out of 5 and deserialize it. Use UUID to prvent object mutation.

	`Assignment_4.java`

	Output - 
	```java
	Object has been serialized
	Data before Deserialization.
	name = aananth
	age = 20
	a = 2
	b = 1000
	c = 12
	Object has been deserialized
	Data after Deserialization.
	name = aananth
	age = 20
	a = 0	// Not serialized
	b = null  // Not serialized
	c = 12
	```