# Write your MySQL query statement below
-- select name from  SalesPerson join
-- (select sales_id from Orders
-- group by com_id
--   HAVING NOT (com_id = 1))f
-- on f.sales_id =SalesPerson.sales_id;
SELECT name
FROM SalesPerson
WHERE sales_id NOT IN (
    SELECT sales_id
    FROM Orders
    WHERE com_id = (    
        SELECT com_id
        FROM Company
        WHERE name = 'RED'
    )
);
