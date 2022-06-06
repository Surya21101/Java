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
alter table Employee rename column Job_Id to Job_Title;
select Comm_Pct from Employee;
