# Write your MySQL query statement below
SELECT Email from Person
Group by email
having count(*)>1;