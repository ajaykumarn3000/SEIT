use ajaykumar;
show tables;
select * from ajaykumar.employee;
select count(*) from employee;
select count(fname) from employee;

select distinct (dnum) from  employee;
select max(salary) from employee;

select min(salary) from employee;

select sum(salary) from employee;

select avg(salary) as avg_sal from employee;

select sum(salary) from employee where Dnum =2;

select fname, dnum from ajaykumar.employee group by dnum;

select count(Fname), dnum from employee group by dnum;

#write a query to find the sum of salary of employees from each department
select sum(salary), dnum from employee group by dnum order by sum(salary);

select count(*) as no_of_emp, dnum from employee group by dnum order by count(*);

select count(*) as no_of_emp, dnum from employee group by dnum order by count(*) desc;

desc employee;

#write a query to find the number of employees in each department
select count(*) as no_of_emp, dnum, salary from employee where salary=12345 group by dnum;

#write a query department where the no of wmployees is greater than or equal to 2.
select count(*) as no_of_emp, dnum from employee group by dnum having count(*) > 2 order by no_of_emp ;

# find all employee who are from the same addresss as the address of the employee_name equal to bianca
select * from employee where salary=(select salary from employee where fname="Binaka");

# find the second highest salary from the employee table.
select * from employee where salary=(select max(salary) from employee where salary < (select max(salary) from employee));
