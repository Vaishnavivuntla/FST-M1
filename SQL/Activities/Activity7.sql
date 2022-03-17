select SUM(purchase_amount) AS "TotalSum" from orders;

select AVG(purchase_amount) AS "Avgs" from orders;

select MAX(purchase_amount) AS "Maximum" from orders;

select MIN(purchase_amount) AS "Minimum" from orders;

select COUNT(DISTINCT salesman_id) AS "Total_Count" from orders;