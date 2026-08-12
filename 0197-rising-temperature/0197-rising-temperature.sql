# Write your MySQL query statement below
select w2.id from Weather w1 
join Weather w2 
ON w2.recordDate = DATE_ADD(w1.recordDate, INTERVAL 1 DAY)
and w1.temperature<w2.temperature;