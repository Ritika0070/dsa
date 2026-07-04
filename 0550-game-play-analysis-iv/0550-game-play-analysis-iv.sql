# Write your MySQL query statement below
select  Round((count(distinct f.player_id)*1.0 / (select count(distinct a.player_id)from Activity a)),2) as fraction 
from Activity a inner join(
    select player_id,min(event_date)as first_login from Activity 
    group by player_id
    )f
    on a.player_id=f.player_id
    where a.event_date =Date_Add(f.first_login,interval 1 day);
