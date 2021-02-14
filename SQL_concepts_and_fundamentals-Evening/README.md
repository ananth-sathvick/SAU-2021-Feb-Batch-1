> Insert more than 10 records in each and every table created

```
SELECT * FROM basic_info
````

![Basic Info](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/basic_info.png?raw=true)

```
SELECT * FROM sub_info
````

![Subject Info](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/sub_info.png?raw=true)

```
SELECT * FROM admission
````

![Admission Info](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/admission.png?raw=true)

```
SELECT * FROM scholarship
````

![Scholarship](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/scholarship.png?raw=true)

>Update any 5 records of your choice in any table like update the StudentAddress with some other address content and likewise so on with any records of any table of your choice

```
1. UPDATE `basic_info` SET `gender` = 'female' WHERE `basic_info`.`roll_no` = 658;

2. UPDATE `admission` SET `amt_paid` = '304387' WHERE `admission`.`stud_roll_no` = 724;

3. UPDATE `sub_info` SET `subject` = 'Information Science' WHERE `sub_info`.`stud_roll_no` = 846;

4. UPDATE `scholarship` SET `payment_type` = 'Offline' WHERE `scholarship`.`stud_roll_no` = 812;

5. UPDATE `basic_info` SET `address` = '51536 Russel Pine Suite 160\r\nHettingerhaven, MT 87065' WHERE `basic_info`.`roll_no` = 870;
```

```
SELECT * FROM basic_info
````

![Basic Info](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/basic_info_up.png?raw=true)

```
SELECT * FROM sub_info
````

![Subject Info](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/sub_info_up.png?raw=true)

```
SELECT * FROM admission
````

![Admission Info](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/admission_up.png?raw=true)

```
SELECT * FROM scholarship
````

![Scholarship](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/scholarship_up.png?raw=true)

>Select the student details records who has received the scholarship more than 5000Rs/- 

```
select b.*,s.amount from basic_info b
join scholarship s on b.roll_no = s.stud_roll_no
where s.amount > 5000
```
![7 op](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/7op.png?raw=true)

>Select the students who opted for scholarship but has not got the scholarship

```
select * from basic_info b
where b.applied_for_sc = 1 AND b.roll_no NOT IN 
(
    SELECT stud_roll_no from scholarship
)
```
![8 op](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/8op.png?raw=true)

```
CREATE PROCEDURE `basic_info`()
BEGIN
    UPDATE sub_info set sub_info.percentage = ( sub_info.marks_obtained / sub_info.total_marks ) * 100 , sub_info.status = case when sub_info.percentage >= 35 THEN "PASS" ELSE "FAIL" END;
END

CALL `basic_info`();
```
![9 op](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/9op.png?raw=true)

>Decide the category of the scholarship depending upon the marks/percentage obtained by the student and likewise update the ScholarshipCategory column, create a stored procedure in order to handle this operation

```
CREATE PROCEDURE `sch_cat`() 
BEGIN

UPDATE scholarship JOIN sub_info on sub_info.stud_roll_no = scholarship.stud_roll_no set  scholarship.category =
CASE WHEN sub_info.percentage > 90 THEN "1"

              WHEN sub_info.percentage <= 90 AND sub_info.percentage >80 THEN "2"
              
              WHEN  sub_info.percentage <= 80 AND sub_info.percentage >70 THEN "3"
              
             ELSE "4"
         END
         , scholarship.amount = 
         CASE WHEN sub_info.percentage > 90 THEN 8000
              WHEN sub_info.percentage <= 90 AND sub_info.percentage >80 THEN 6000 
              WHEN sub_info.percentage <= 80 AND sub_info.percentage >70 THEN 4000              
             ELSE 2000
         END;
END


CALL `sch_cat`();
```
![10 op](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/10op.png?raw=true)

>Create the View which shows balance amount to be paid by the student along with the student detailed information (use join)

```
CREATE VIEW balance_amount AS 
SELECT b.* , a.balance
from basic_info b join admission a on a.stud_roll_no = b.roll_no;
```

![11 op](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/11op.png?raw=true)

>Get the details of the students who haven’t got any scholarship (use joins/subqueries)

```
SELECT b.* 
FROM basic_info b
WHERE b.roll_no NOT IN 
(
    SELECT scholarship.stud_roll_no FROM scholarship
)
```

![12 op](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/12op.png?raw=true)

>Create Stored Procedure which will be return the amount balance to be paid by the student as per the student roll number passed through the stored procedure as the input

```
CREATE PROCEDURE get_balance (IN roll_no BIGINT UNSIGNED) 
BEGIN

SELECT admission.balance from admission WHERE admission.stud_roll_no = roll_no;

END


SET @p0='938'; 
CALL `get_balance`(@p0);
```

![13 op](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/13op.png?raw=true)


>Retrieve the top five student details as per the StudentMarksPercentage values (use subqueries)

```
SELECT BB.*
FROM (SELECT b.*,s.percentage
      FROM basic_info b 
      JOIN sub_info s on s.stud_roll_no = b.roll_no
      ORDER BY s.percentage DESC) AS BB
LIMIT 5

```
![14 op](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/14op.png?raw=true)

>Try to use all the three types of join learned today in a relevant way, and explain the same why you thought of using that particular join for your selected scenarios (try to cover relevant and real time scenarios for all the three studied joins)

```
Cross join - To create a table which compares a particular student with every other student 

SELECT * FROM sub_info s
CROSS JOIN sub_info f 
WHERE NOT s.stud_roll_no = f.stud_roll_no  
ORDER BY s.stud_roll_no ASC

```
![15 op 1](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/15op_1.png?raw=true)

```
Inner join - To get details of students who have recieved scholarship
```

![15 op 2](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/15op_2.png?raw=true)

```
Outer join - Get student details who didn't recieve scholarship

SELECT * 
FROM basic_info
LEFT OUTER JOIN scholarship ON scholarship.stud_roll_no = basic_info.roll_no
WHERE scholarship.stud_roll_no is NULL
```

![15 op 3](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/15op_3.png?raw=true)


>Mention the differences between the delete, drop and truncate commands

```
1. DELETE :
Basically, it is a Data Manipulation Language Command (DML). It is use to delete the one or more tuples of a table. With the help of “DELETE” command we can either delete all the rows in one go or can delete row one by one. i.e., we can use it as per the requirement or the condition using Where clause. It is comparatively slower than TRUNCATE cmd.

SYNTAX –
If we want to delete all the rows of the table:
DELETE from ; 

SYNTAX –
If we want to delete the row of the table as per the condition then we use WHERE clause,
DELETE from  WHERE  ; 

Note –
Here we can use the “ROLLBACK” command to restore the tuple.

2. DROP :
It is a Data Definition Language Command (DDL). It is use to drop the whole table. With the help of “DROP” command we can drop (delete) the whole structure in one go i.e. it removes the named elements of the schema. By using this command the existence of the whole table is finished or say lost.



SYNTAX –
If we want to drop the table:
DROP table ;  

Note –
Here we can’t restore the table by using the “ROLLBACK” command.

3. TRUNCATE :
It is also a Data Definition Language Command (DDL). It is use to delete all the rows of a relation (table) in one go. With the help of “TRUNCATE” command we can’t delete the single row as here WHERE clause is not used. By using this command the existence of all the rows of the table is lost. It is comparatively faster than delete command as it deletes all the rows fastly.

SYNTAX –
If we want to use truncate :
TRUNCATE  ;  

Note –
Here we can’t restore the tuples of the table by using the “ROLLBACK” command.
```

> Get the count of the Scholarship category which is highly been availed by the students, i.e. get the count of the total number of students corresponding to the each scholarships category

```
SELECT s.category,COUNT(s.category) AS count
FROM scholarship s
GROUP BY s.category
```
![17 op](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/17op.png?raw=true)

>Along with the assignment no. 17 try to retrieve the maximum used scholarship category

```
SELECT
    cc.category,
    max(cc.count) as max_count
FROM
    (
    SELECT
        s.category,
        COUNT(s.category) AS COUNT
    FROM
        scholarship s
    GROUP BY
        s.category
) AS cc
WHERE
    cc.count =(
    SELECT
        MAX(c.count)
    FROM
        (
        SELECT
            s.category,
            COUNT(s.category) AS COUNT
        FROM
            scholarship s
        GROUP BY
            s.category
    ) AS c
)
GROUP BY cc.category
```

![18 op](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/18op.png?raw=true)

>Retrieve the percentage of the students along with students detailed information who has scored the highest percentage along with availing the maximum scholarship amount

```
SELECT b.*,(s.percentage)
FROM basic_info b 
JOIN sub_info s on s.stud_roll_no = b.roll_no
WHERE b.roll_no IN
(
    SELECT scholarship.stud_roll_no
    FROM scholarship
    WHERE scholarship.amount = 
    (
        SELECT MAX(scholarship.amount)
        FROM scholarship
    )
) AND s.percentage = 
(
    SELECT MAX(ss.percentage) from sub_info ss
)
```

![19 op](https://github.com/ananth-sathvick/SAU-2021-Feb-Batch-1/blob/main/SQL_concepts_and_fundamentals-Evening/19op.png?raw=true)


>Difference between the Triggers, Stored Procedures, Views and Functions

```
Trigger: A trigger is a stored procedure in database which automatically invokes whenever a special event in the database occurs. For example, a trigger can be invoked when a row is inserted into a specified table or when certain table columns are being updated.

Syntax:

create trigger [trigger_name] 
[before | after]  
{insert | update | delete}  
on [table_name]  
[for each row]  
[trigger_body] 
Explanation of syntax:

create trigger [trigger_name]: Creates or replaces an existing trigger with the trigger_name.

[before | after]: This specifies when the trigger will be executed.

{insert | update | delete}: This specifies the DML operation.

on [table_name]: This specifies the name of the table associated with the trigger.

[for each row]: This specifies a row-level trigger, i.e., the trigger will be executed for each row being affected.

[trigger_body]: This provides the operation to be performed as trigger is fired


BEFORE and AFTER of Trigger:
BEFORE triggers run the trigger action before the triggering statement is run.
AFTER triggers run the trigger action after the triggering statement is run.
```
```
Stored Procedures are created to perform one or more DML operations on Database. It is nothing but the group of SQL statements that accepts some input in the form of parameters and performs some task and may or may not returns a value.

Syntax : Creating a Procedure

CREATE or REPLACE PROCEDURE name(parameters)
IS
variables;
BEGIN
//statements;
END;
The most important part is parameters. Parameters are used to pass values to the Procedure. There are 3 different types of parameters, they are as follows:

IN:
This is the Default Parameter for the procedure. It always recieves the values from calling program.
OUT:
This parameter always sends the values to the calling program.
IN OUT:
This parameter performs both the operations. It Receives value from as well as sends the values to the calling program.


```
```
Views in SQL are kind of virtual tables. A view also has rows and columns as they are in a real table in the database. We can create a view by selecting fields from one or more tables present in the database. A View can either have all the rows of a table or specific rows based on certain condition.
Syntax:

CREATE VIEW view_name AS
SELECT column1, column2.....
FROM table_name
WHERE condition;

view_name: Name for the View
table_name: Name of the table
condition: Condition to select rows
```
```
Functions

For doing operations on data sql has many built-in functions, they are categorised in two categories and further sub-categorised in different seven functions under each category. The categories are:

Aggregate functions:
These functions are used to do operations from the values of the column and a single value is returned.
AVG()
COUNT()
FIRST()
LAST()
MAX()
MIN()
SUM()

Scalar functions:
These functions are based on user input, these too returns single value.
UCASE()
LCASE()
MID()
LEN()
ROUND()
NOW()
FORMAT()
```