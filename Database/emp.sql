use c2110;
create table emp(
emp_id int primary key,
ename varchar(20) not null,
designation varchar(25) not null,
dept varchar(20),
working_hour varchar(10),
salary double(10,2)
);
#aggregate function - count
select dept,count(dept) as 'total_emp_in_dept' from emp group by dept;
#sum
select dept,sum(working_hour) as 'total_hours' from emp group by dept;
select dept,sum(working_hour) as 'total_hours' from emp where dept = 'operation';
select dept,sum(salary) as 'total_dept_salary' from emp group by dept;
#average
select dept,avg(salary) as 'avg_dept_salary' from emp group by dept;
#min
select ename,dept,min(salary) as 'avg_dept_salary' from emp group by dept;
select ename,dept,min(salary) from emp;
#max
select dept,max(salary) as 'avg_dept_salary' from emp group by dept;
#having
select dept,sum(working_hour) as 'total hours' from emp group by dept having sum(working_hour)>15;
