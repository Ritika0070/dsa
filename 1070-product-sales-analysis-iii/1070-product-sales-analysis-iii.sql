# Write your MySQL query statement below
Select  f.product_id,f.first_year,a.quantity,a.price 
from Sales a Inner Join
    (Select product_id,min(year) as first_year from Sales
    Group by product_id)f
    on a.product_id=f.product_id
    AND a.year = f.first_year;
