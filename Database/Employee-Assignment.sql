use c2110;
create table Employee(
Employee_Id numeric(6),
Last_Name varchar(25),
Job_Id varchar(10),
Salary integer(6),
Comm_Pct integer(4),
MGR_Id integer(6),
Department_Id numeric(4)
);
insert into Employee values 
(198,'Connell','SH_CLERK',2600,2.5,124,50),
(199,'Grant','SH_CLERK',2600,2.2,124,50),
(200,'Whalen','AD_ASST',4400,1.3,101,10),
(201,'Hartstein','IT_PROG',6000,null,100,20),
(202,'Fay','AC_MGR',6500,null,210,20),
(203,'Mavris','AD_VP',7500,null,101,40),
(204,'Baer','AD_PRES',3500,1.5,101,90),
(205,'Higgins','AC_MGR',2300,null,101,60),
(206,'Gitz','IT_PROG',5000,null,103,60),
(100,'King','AD_ASST',8956,0.3,108,100),
(101,'Kochar','SH_CLERK',3400,1.3,118,30);

select Employee_Id,Last_Name,Job_Id from Employee;
select * from Employee where Department_Id = 60;
select * from Employee where Last_Name = 'King';
select distinct Job_Id from Employee;
select Last_Name,Salary,Salary + 300 as 'Increased_Salary' from Employee;
select Last_Name,Salary,Salary + Comm_Pct + 100 as 'Annual_Compensation' from Employee;
select Comm_Pct from Employee;
select Employee_id, Department_id , Salary from employee where SALARY >5000;
select Last_Name, Salary from employee where SALARY between 4000 and 7000;
select * from employee where SALARY =6000 or SALARY=6500 or SALARY=7000;
select * from employee where DEPARTMENT_ID=10 or DEPARTMENT_ID=20 or DEPARTMENT_ID=30 or DEPARTMENT_ID=50;
select * from employee where SALARY != 5000;
select * from employee where JOB_ID = 'SH_CLERK';
update employee set JOB_ID = 'Grade_A' where SALARY >= 5000;
select * from employee where JOB_ID ='SH_CLERK' or JOB_ID='IT_PROG' or JOB_ID='AD_ASST';
select * from employee where JOB_ID ='SH_CLERK' and SALARY<3000;
select last_name,MGR_ID from employee where SALARY>3000 and MGR_ID=101;
