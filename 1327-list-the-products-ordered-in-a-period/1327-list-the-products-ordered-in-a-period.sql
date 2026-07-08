# Write your MySQL query statement below
select  product_name ,x.unit from Products
inner join(
select product_id ,sum(unit) as unit from Orders 
where MONTH(order_date) = 2
and year(order_date)=2020
group by  product_id 
having sum(unit)>=100
)x
on Products.product_id =x.product_id;
