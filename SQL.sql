-- --------------------------- DDL EXP 3 --------------------------------------

-- Create Database
CREATE DATABASE erp;
CREATE DATABASE hello;

-- Delete Database
DROP DATABASE hello;

-- Create Table (Unique, Primary Key, Foreign Key, Not Null, Auto Increment, Check, Default)
USE erp;
CREATE TABLE Department(did INT PRIMARY KEY, branch VARCHAR(20) NOT NULL UNIQUE);
CREATE TABLE Student(pid INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(40) NOT NULL, 
    rollno INT UNIQUE, CHECK(rollno < 60), marks INT DEFAULT 36, 
    did INT NOT NULL, FOREIGN KEY(did) REFERENCES Department(did) );

-- Alter Table (Add new Column)
ALTER TABLE Department ADD HOD VARCHAR(20) NOT NULL;
ALTER TABLE Department ADD intake int DEFAULT 60 AFTER branch;

-- Alter Table (Change Column Type)
ALTER TABLE Department MODIFY COLUMN HOD VARCHAR(40);

-- Alter Table (Rename Column)
ALTER TABLE Department RENAME COLUMN branch TO field;

-- Alter Table (Remove Column)
ALTER TABLE Student DROP COLUMN rollno;

-- Rename Table
RENAME TABLE Department to Course;

-- Truncate Table
TRUNCATE TABLE Student;

-- Drop Table
DROP TABLE Student;

-- ----------------------------DML EXP 4--------------------------------
DESC Department;
-- Insert into table (single row)
INSERT INTO Department(did, branch) VALUES(1, "INFT");

-- Insert into table (multiple row)
INSERT INTO Department(did, branch) VALUES(2, "CMPN"),(3, "MECH");

-- Select from table (all)
SELECT * FROM Department;

-- Select from table (with condition)
SELECT * FROM Department WHERE(did=1);

-- Select 1 column from table
SELECT branch from Department;

-- Update a data in table
UPDATE Department SET branch="EXTC" WHERE branch="INFT";

-- Delete a data in table
DELETE FROM Department WHERE branch="CMPN";

-- ----------------AGGREGATE FUNCTIONS EXP 5 --------------------------
-- count, distinct, max, min, sum, avg
-- Group by
-- Order by
-- having clause 
-- nested queries 

Create database exp5;
use exp5;

Create table Employee(eid int primary key, name varchar(20) not null, exp int default 0, salary int default 25000, loc varchar(20));
insert into employee values(1, "Ajaykumar", 3, 40000, "Chennai"),
(2, "Bianca", 2, 35000, "Manglore"),
(3, "Kevin", 3, 35000, "Mumbai"),
(4, "Subhodeep", 1, 25000, NULL),
(5, "Melvin", 3, 30000, "Chennai");

-- Count total rows
SELECT COUNT(*) FROM Employee;

-- Count number of loc column
SELECT COUNT(loc) FROM Employee;

-- Display Maximum salary
SELECT MAX(salary) FROM Employee; 

-- Display minimum experience
SELECT MIN(exp) FROM Employee;

-- display total salary as total
SELECT SUM(salary) AS Total FROM Employee;

-- display all unique values in salary
SELECT DISTINCT salary FROM Employee;

-- Display avg exp of employee from chennai
SELECT AVG(exp) AS avg_exp FROM Employee WHERE loc="Chennai";

-- write a query to find the number of employees in each loc
SELECT COUNT(*), loc FROM EMPLOYEE group by loc;

-- write a query to find the sum of salary of employees from each loc
SELECT SUM(salary), loc from employee group by loc; 

-- find all employee who are from the same loc as the loc of the employee_name equal to melvin
SELECT * from Employee where loc = (select loc from employee where name="melvin");

-- find the second highest salary from the employee table
SELECT * FROM Employee WHERE salary = (SELECT MAX(salary) FROM Employee WHERE salary < (SELECT MAX(salary) FROM Employee));

-- ----------------- JOIN AND VIEWS Exp 6 ----------------------

CREATE DATABASE exp6;
USE exp6;
CREATE TABLE Employee(id int primary key, name varchar(20) not null, loc varchar(20));
CREATE TABLE Salary(name varchar(20) not null, salary int);

INSERT INTO Employee VALUES (1, "Ajaykumar", "Borivali"), (2, "Bianca", "Andheri"), (3, "Kevin", "Malad"), (4, "Subhodeep", NULL), (5, "Vishal", NULL);
INSERT INTO Salary VALUES ("Bianca", 30000), ("Mokshada", 40000), ("Ajaykumar", 32444), ("Kevin", NULL), ("Joseph", NULL);

-- Inner Join
SELECT * FROM Employee INNER JOIN Salary ON Employee.name=Salary.name;

-- Left Outer join
SELECT * FROM Employee LEFT JOIN Salary ON Employee.name = Salary.name;

-- Right Outer Join
SELECT Employee.id, Salary.name, Employee.loc, Salary.salary FROM Employee RIGHT JOIN Salary ON Employee.name = Salary.name;

-- Full Outer Join
SELECT * FROM EMPLOYEE LEFT JOIN Salary ON Employee.name = Salary.name
UNION
SELECT * FROM EMPLOYEE RIGHT JOIN Salary ON Employee.name = Salary.name;

-- Create View
CREATE VIEW emp AS SELECT * FROM Employee WHERE id > 3;

-- Select View 
SELECT * FROM emp;

-- Drop View
DROP VIEW emp;


-- ------------------GRANT and REVOKE Exp 7 ------------------------

-- create user
CREATE USER "ajay"@"localhost" IDENTIFIED BY "dattebayo";

-- show grants
SHOW GRANTS FOR "ajay"@"localhost";

-- grant select permission
GRANT SELECT ON exp6.* TO "ajay"@"localhost";

-- grant insert permission
GRANT INSERT ON exp6.* TO "ajay"@"localhost";

-- grant update permission
GRANT UPDATE ON exp5.* TO "ajay"@"localhost";
GRANT UPDATE(name) ON exp6.Employee TO "ajay"@"localhost"; -- only update a single column in a table

-- grant delete permission 
GRANT DELETE ON exp6.Salary TO "ajay"@"localhost";

-- show grants
SHOW GRANTS FOR "ajay"@"localhost";

-- switch to different user
system mysql -u ajay -p

-- view all users
select user, host from mysql.user;

-- revoke select permission
REVOKE SELECT ON Exp6.* FROM "ajay"@"localhost";

-- revoke insert permission
REVOKE INSERT ON Exp6.* FROM "ajay"@"localhost";

-- revoke update permission
REVOKE UPDATE ON Exp5.* FROM "ajay"@"localhost";
REVOKE UPDATE(name) ON Exp6.Employee FROM "ajay"@"localhost";

-- revoke delete permission
REVOKE DELETE ON Exp6.Salary FROM "ajay"@"localhost";

-- grant all permission
GRANT ALL ON *.* TO "ajay"@"localhost"; 

-- revoke all permission
 REVOKE ALL ON *.* FROM "ajay"@"localhost";

-- change user password
 ALTER user "ajay"@"localhost" identified by "dattebayo";

-- set autocommit
SET autocommit=1; -- enable
SET autocommit=0; -- disable


-- --------------------------- TRIGGERS Exp 8 -------------------------------

