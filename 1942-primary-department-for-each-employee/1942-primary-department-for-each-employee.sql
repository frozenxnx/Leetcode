# Write your MySQL query statement below
SELECT e1.employee_id, (e1.department_id)
FROM Employee as e1 
WHERE e1.primary_flag = 'Y'
UNION
SELECT employee_id, department_id
FROM Employee 
GROUP BY employee_id
HAVING COUNT(employee_id) = 1
ORDER BY employee_id;
