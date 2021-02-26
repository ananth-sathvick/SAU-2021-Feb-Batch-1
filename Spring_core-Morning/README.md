# Spring core assignment and AOP

Spring core and AOP assignment


1. Create project with Rectangle as a base class.
   Create Point class and add 4 Point class objects in Rectangle.
   Add height and width also as properties in rectriangle class.
   Add spring configuration using JAVA BASED approach(Using java configuration class).
   
   Bonus-Use individual objects and also try collections(List,set,map) of Obejcts for ex.
   @Bean
    public List<String> strList(){
        return Arrays.asList("pink", "red", "yellow");
    }

Output -

```java
Inside getCircle
Running Advice Around 
Running Advice After 
Running Advice AfterReturning 
Exception raised
Exception in thread "main" java.lang.ArithmeticException
	at Mypackage.ServiceShape.getCircleException(ServiceShape.java:14)
	at MainApp.main(MainApp.java:10)
```

2. Create aspect using After, AfterReturning, AfterThrowing, Around advices in AOP.
   Use pointcut types within, args also along with execution.
   Refer springAOP project shared on github.

```java
Rectangle Drawn of height 5 and width 4 with points 
 
Point A 10 20
Point B 14 20
Point C 14 25
Point D 10 25
```