use ajaykumar;

create table customers(customer_id int primary key auto_increment, first_name varchar(20) not null);
create table orders(order_id int primary key auto_increment, amount float not null, customer_id int not null); 

insert into customers(first_name) values ("Ajaykumar"), ("Bianca"), ("Kevin"), ("Subhodeep"), ("Mokshada");
truncate table customers;
insert into orders(amount, customer_id) values (1233, 10), (67212, 2), (3423, 4), (5262, 8), (7838, 5);

select * from customers;

select * from (customers join orders on customers.customer_id=orders.customer_id) where amount > 4000;
select * from (customers left join orders on customers.customer_id=orders.customer_id);

select * from (customers right join orders on customers.customer_id=orders.customer_id);



create view view_order as select * from orders where amount > 4000;


select * from view_order;

create view view_customer_order as select customers.customer_id, customers.first_name, orders.amount, orders.order_id from customers, orders;
select * from view_customer_order;




