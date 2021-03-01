# Spring core assignment and AOP

Spring core and AOP assignment


1. Create project with Rectangle as a base class.
   Create Point class and add 4 Point class objects in Rectangle.
   Add height and width also as properties in rectriangle class.
   Add spring configuration using JAVA BASED approach(Using java configuration class).
   
   ```Bonus-Use individual objects and also try collections(List,set,map) of Obejcts for ex.
   @Bean
    public List<String> strList(){
        return Arrays.asList("pink", "red", "yellow");
    }
    ```

Output -

```java
Rectangle Drawn of height 5 and width 4 with points 
 
Point A 10 20
Point B 14 20
Point C 14 25
Point D 10 25
```

2. Create aspect using After, AfterReturning, AfterThrowing, Around advices in AOP.
   Use pointcut types within, args also along with execution.
   Refer springAOP project shared on github.

Output -

```java
------------Set Circle Name------------
Inside getCircle
Advice After being called 
Advice Around being called
Inside setName of circle
Advice After returning and new value is My circle 1

------------Get Circle Name------------
Inside getCircle
Advice After being called 
Inside getName of circle
Advice After being called 
Name = My circle 1

------------Exception------------
Inside getRectangle
Advice After being called 
Advice Around being called
Inside setName of rectangle
Advice After throwing new exception and exception thrown is java.lang.ArithmeticException
```