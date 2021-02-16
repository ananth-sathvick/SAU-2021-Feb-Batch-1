# NoSQL Assignment
1. ### Bookmyshow
Design an application to support the following features =>

    1. Search movie by name
    2. Search movie by city name
    3. Insert movie
    4. Delete movie

`bookmyshow` folder contains the code for the same and the json file `Bookmyshow.postman_collection.json` is the exported API collections from postman

___

2. ### Football

Create an application which supports the following features =>

    1. Insertion of football player
    2. Deletion of football player
    3. Get remove football player by id
    4. Get the names of the footballers having more than 10 goals in a year

`football` folder contains the code for the same and the json file `Football.postman_collection.json` is the exported API collections from postman
___
3. ### Remove primary index and add appropriate index

To create primary index - 
```SQL
create primary index on bookmyshow
```

To remove a primary index - 
```SQL
drop primary index on football
```

Select appropriate indices - 

1. Bookmyshow - id field (movie id) is appropriate for creating index
```SQL
create index bookmyshow_id on bookmyshow(id)
```

2. Football - id field (or the jersey number) is appropriate for creating index

```SQL
create index footballer_id on football(id)
```
___

