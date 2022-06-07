use c2110;
#inner join
select customer_table.customername,order_table.orderdate from customer_table inner join 
order_table on customer_table.customerid = order_table.customerid;
#or
select customername,orderdate from customer_table inner join 
order_table on customer_table.customerid = order_table.customerid;
#or
select customername,orderdate from customer_table inner join order_table where
customer_table.customerid = order_table.customerid;
#leftouterjoin
select customer_table.customerid,customername,orderdate from customer_table left join
order_table on customer_table.customerid = order_table.customerid;
#rightouterjoin
select customer_table.customerid,customername,orderdate from customer_table right join
order_table on customer_table.customerid = order_table.customerid;
#foreign key
alter table order_table add foreign key(customerid) references customer_table(customerid); 
#foreignkey while table creation
create table orders(
order_id int primary key,
orderdate date,
quantity int,
price double(5,2),
customerid int,foreign key(customerid) references customer_table(customerid)
);
