create database Ajaykumar;
use Ajaykumar;
show tables;
create table department(Dno int primary key, Dname varchar(20) unique);
show tables;
desc department;
create table employee(Eno int primary key, Ename varchar(20) not null, DOB date not null, salary int not null,
check(salary>10000 and salary<1000000), dnum int, foreign key(dnum) references department(Dno));
show tables;
drop table employee;
desc employee;
create table dependance(depName varchar(20) not null, relation varchar(20) not null,
age int not null, empNo int not null, foreign key(empNo) references employee(Eno));
drop table dependance;
desc dependance;
create table project(pno int primary key auto_increment, pname varchar(20) not null unique, dnum1 int, foreign key(dnum1)references department(dno), loc varchar(20) not null default "Mumbai");
desc project;

alter table employee add lName varchar(10) not null after ename;
desc employee;
alter table employee add pno int not null unique;
alter table employee modify column salary float;
alter table employee rename column ename to fName;
alter table employee drop column pno;

rename table project to newProject;
desc newproject;

truncate table newproject;
drop table newproject;
drop database ajaykumar;