# Write your MySQL query statement below
SELECT p.product_id,COALESCE(ROUND(SUM(price*units)/SUM(units),2),0.00) AS average_price
FROM prices p
LEFT JOIN UnitsSold u
ON p.product_id = u.product_id AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id