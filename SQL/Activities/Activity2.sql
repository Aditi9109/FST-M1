REM   Script: Activity_2
REM   Activity 2


CREATE TABLE Customers (  
    CustomerID int,  
    CustomerName varchar(52),  
    ContactName varchar(32),  
    Address varchar(255),  
    City varchar(50),  
    PostalCode varchar(20),  
    Country varchar(20)  
);

CREATE TABLE salesman;

CREATE TABLE salesman (  
    salesman_id int,  
    salesman_name varchar2(32),  
    salesman_city varchar2(32),  
    commission int  
);

DESCRIBE salesman 


INSERT INTO salesman  
VALUES (5002, 'Nail Knite', 'Paris', 13);

SELECT * FROM salesman;

INSERT INTO salesman  
VALUES (5005, 'Pit Alex', 'London', 11);

SELECT * FROM salesman;

INSERT ALL  
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)  
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

