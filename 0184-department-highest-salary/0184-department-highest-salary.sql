# Write your MySQL query statement below
select d.name as  Department,
e.name as  Employee,
e.salary as Salary
from Employee e
JOIN Department d
on e.departmentId =d.id
where e.salary=(SELECT MAX(salary)
    FROM Employee
    WHERE departmentId = e.departmentId
    );