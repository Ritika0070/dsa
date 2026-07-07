(
SELECT u.name AS results
FROM Users u
INNER JOIN
(
    SELECT mr.user_id,
           COUNT(*) AS cnt
    FROM MovieRating mr
    GROUP BY mr.user_id
) x
ON u.user_id = x.user_id
ORDER BY x.cnt DESC, u.name ASC
LIMIT 1
)

UNION ALL

(
SELECT m.title AS results
FROM Movies m
INNER JOIN
(
    SELECT mr.movie_id,
           AVG(mr.rating) AS avg_rating
    FROM MovieRating mr
    WHERE MONTH(mr.created_at) = 2
      AND YEAR(mr.created_at) = 2020
    GROUP BY mr.movie_id
) y
ON m.movie_id = y.movie_id
ORDER BY y.avg_rating DESC, m.title ASC
LIMIT 1
);