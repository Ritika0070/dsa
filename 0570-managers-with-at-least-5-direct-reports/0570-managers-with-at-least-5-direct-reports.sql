# Write your MySQL query statement below
select name from Employee e inner join
(
select managerId from Employee
Group by (managerId)
having count(*)>=5
)f
on e.id=f.managerId;
