create database Ajaykumar;
use Ajaykumar;  
create table department(Dno int primary key, Dname varchar(20) unique); 
show tables;
desc department;
create table employee(Eno int primary key, fname varchar(20) not null, lname varchar(20) not null, DOB date not null, salary int not null, check(salary>10000 and salary<1000000), dnum int, foreign key(dnum) references department(Dno));
insert into department(dno, dname) values (1, "INFT");
select * from department;
insert into department(dno, dname) values (2, "CMPN"), (3, "MECH"), (4, "EXTC"), (5, "ELEC");
select * from department;
insert into employee(Eno, fName, lName, DOB, salary, dnum) values
 (1, "Ajaykumar", "Nadar", "2003-08-20", 12345, 1),
 (2, "Kevin", "Nadar", "2004-02-24", 12345, 1), 
 (3, "Binaka","Noronha", "2005-01-26", 12345, 1), 
 (4, "Delisha", "Naik", "2004-12-31", 12345, 2), 
 (5, "Melvin", "Das", "2004-12-24", 12345, 2), 
 (6, "Arati", "Vinod", "2004-02-24", 12345, 3), 
 (7, "Layba","Khan", "2005-01-26", 12345, 1), 
 (8, "Strawbe", "Shake", "2004-12-31", 12345, 4), 
 (9, "Violet", "Grapes", "2004-12-24", 12345, 4), 
 (10, "Joseph", "Kumari", "2004-12-24", 12345, 2),
 (11, "Vaidehi", "Golegoa", "2004-12-21", 12345, 4);
select * from employee;
update employee set dnum=1 where dnum = 3;
update employee set salary=60000 where dnum=1;
delete from employee where Eno=9;