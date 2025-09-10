# Write your MySQL query statement below
select v.customer_id,count(v.visit_id) as count_no_trans from Visits as v
LEFT JOIN Transactions as t
ON v.visit_id = t.visit_id
WHERE t.transaction_id is null
Group by customer_id;

