# Write your MySQL query statement below
SELECT p.project_id,ROUND(SUM(experience_years)/count(name),2) as average_years
FROM Project p
JOIN Employee e
ON p.employee_id = e.employee_id 
GROUP BY p.project_id