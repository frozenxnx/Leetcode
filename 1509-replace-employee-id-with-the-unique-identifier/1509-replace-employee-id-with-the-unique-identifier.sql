# Write your MySQL query statement below
SELECT name,unique_id From Employees as emp
LEFT JOIN EmployeeUNI as empi
ON emp.id = empi.id;