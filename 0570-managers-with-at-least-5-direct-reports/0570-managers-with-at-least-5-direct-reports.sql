# Write your MySQL query statement below
SELECT (e.name)
FROM Employee e
JOIN Employee e1
ON e.id = e1.managerId
GROUP BY e1.managerId
HAVING COUNT(e1.managerId)>=5