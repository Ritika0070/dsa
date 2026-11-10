# Write your MySQL query statement below
SELECT employee_id, department_id
FROM Employee e
WHERE primary_flag = 'Y'

UNION

SELECT employee_id, department_id
FROM Employee e1
-- WHERE primary_flag = 'N'
GROUP BY employee_id
HAVING COUNT(department_id) = 1;