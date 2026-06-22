# Write your MySQL query statement below
Select customer_id from Customer
GROUP BY customer_id
HAVING COUNT(distinct product_key ) = (select count(*) from Product);



