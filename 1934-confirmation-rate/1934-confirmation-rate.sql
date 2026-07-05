# Write your MySQL query statement below
select s.user_id , Round(ifnull(x.confirm *1.0/total,0),2) as confirmation_rate from Signups s
left join
(select  c.user_id, count(*) as total, sum(action='confirmed') as confirm 
from Confirmations c
group by user_id) x
on s.user_id  = x. user_id ;